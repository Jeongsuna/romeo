package com.example.kotlin.C0007_XQUERYI

import java.util.Hashtable
import java.util.Properties
import javax.naming.Context
import javax.naming.NamingException
import javax.naming.directory.DirContext
import javax.naming.directory.InitialDirContext
import javax.xml.namespace.QName
import javax.xml.xquery.XQException
import javax.xml.xquery.XQPreparedExpression
import javax.xml.xquery.XQResultSequence

class C0007_XQUERYI__simple_01 {
    @Throws(NamingException::class, XQException::class)
    fun bad(props: Properties) {
        // 외부로부터 입력을 받음
        val name: String = props.getProperty("name")
        val env = Hashtable()
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sunjndi.ldap.LdapCtxFactory")
        env.put(Context.PROVIDER_URL, "ldap://localhost:389/o=rootDir")
        val ctx: DirContext = InitialDirContext(env)
        val xqds: javax.xml.xquery.XQDataSource = ctx.lookup("xqj/personnel") as javax.xml.xquery.XQDataSource
        val conn: javax.xml.xquery.XQConnection = xqds.getConnection()
        val es = "doc('users.xml')/userlist/user[uname='$name']"
        // 입력값이 XQuery의 인자로 사용
        /* FLAW : CWE-652 */
        val expr: XQPreparedExpression = conn.prepareExpression(es)
        val result: XQResultSequence = expr.executeQuery()
        while (result.next()) {
            val str: String = result.getAtomicValue()
            if (str.indexOf('>') < 0) {
                System.out.println(str)
            }
        }
    }

    @Throws(NamingException::class, XQException::class)
    fun good(props: Properties) {
        // 외부로부터 입력을 받음
        val name: String = props.getProperty("name")
        val env = Hashtable()
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sunjndi.ldap.LdapCtxFactory")
        env.put(Context.PROVIDER_URL, "ldap://localhost:389/o=rootDir")
        val ctx: DirContext = InitialDirContext(env)
        val xqds: javax.xml.xquery.XQDataSource = ctx.lookup("xqj/personnel") as javax.xml.xquery.XQDataSource
        val conn: javax.xml.xquery.XQConnection = xqds.getConnection()
        val es = "doc('users.xml')/userlist/user[uname='\$xpathname']"
        // 입력값이 XQuery의 인자로 사용
        val expr: XQPreparedExpression = conn.prepareExpression(es)
        // bindString 함수 사용함으로써 외부 입력으로 인한 쿼리구조 변조 방지
        expr.bindString(QName("xpathname"), name, null)
        val result: XQResultSequence = expr.executeQuery()
        while (result.next()) {
            val str: String = result.getAtomicValue()
            if (str.indexOf('>') < 0) {
                System.out.println(str)
            }
        }
    }
}