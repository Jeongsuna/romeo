package com.example.kotlin.C0009_LDAPI.s01

import testcasesupport.IO
import java.util.*
import java.util.logging.Level
import javax.naming.Context
import javax.naming.NamingEnumeration
import javax.naming.NamingException
import javax.naming.directory.DirContext
import javax.naming.directory.InitialDirContext
import javax.naming.directory.SearchControls
import javax.naming.directory.SearchResult
import javax.servlet.http.HttpServletRequest

class C0009_LDAPI__simple_01 {
    @Throws(NamingException::class)
    fun bad(userSN: String, userPassword: String) {
        val env = Hashtable<String, String>()
        env[Context.INITIAL_CONTEXT_FACTORY] = "com.sun.jndi.ldap.LdapCtxFactory"
        try {
            val dctx: DirContext = InitialDirContext(env)
            val sc = SearchControls()
            val attributeFilter = arrayOf("cn", "mail")
            sc.returningAttributes = attributeFilter
            sc.searchScope = SearchControls.SUBTREE_SCOPE
            val base = "dc=example,dc=com"
            /* FLAW : CWE-90 */
            val filter = "(&(sn=$userSN)(userPassword=$userPassword))"
            val results: NamingEnumeration<*> = dctx.search(base, filter, sc)
            while (results.hasMore()) {
                val sr = results.next() as SearchResult
                val attrs = sr.attributes
                val attr = attrs["cn"]
                IO.logger.log(Level.INFO, attr.toString())
            }
            dctx.close()
        } catch (e: NamingException) {
            IO.logger.log(Level.WARNING, e.toString())
        }
    }

    fun badSrc(req: HttpServletRequest) {
        bad(req.getParameter("userSN"), req.getParameter("userSN"))
    }

    @Throws(NamingException::class)
    fun good(userSN: String, userPassword: String) {
        val env = Hashtable<String, String>()
        env[Context.INITIAL_CONTEXT_FACTORY] = "com.sun.jndi.ldap.LdapCtxFactory"
        try {
            val dctx: DirContext = InitialDirContext(env)
            val sc = SearchControls()
            val attributeFilter = arrayOf("cn", "mail")
            sc.returningAttributes = attributeFilter
            sc.searchScope = SearchControls.SUBTREE_SCOPE
            val base = "dc=example,dc=com"

            // userSN과 userPassword 값에서 LDAP 필터를 조작할 수 있는 문자열을 제거하고 사용
            require(!(!userSN.matches(Regex.fromLiteral("[\\w\\s]*")) || !userPassword.matches(Regex.fromLiteral("[\\w]*")))) { "Invalid input" }
            val filter = "(&(sn=$userSN)(userPassword=$userPassword))"
            val results: NamingEnumeration<*> = dctx.search(base, filter, sc)
            while (results.hasMore()) {
                val sr = results.next() as SearchResult
                val attrs = sr.attributes
                val attr = attrs["cn"]
                IO.logger.log(Level.INFO, attr.toString())
            }
            dctx.close()
        } catch (e: NamingException) {
            IO.logger.log(Level.WARNING, e.toString())
        }
    }
}