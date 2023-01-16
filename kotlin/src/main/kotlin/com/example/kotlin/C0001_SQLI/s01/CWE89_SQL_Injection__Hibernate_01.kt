package com.example.kotlin.C0001_SQLI.s01

import org.hibernate.Session
import org.hibernate.SessionFactory
import javax.servlet.http.HttpServletRequest
import java.sql.*
import org.hibernate.cfg.Configuration
import org.hibernate.query.Query

class CWE89_SQL_Injection__Hibernate_01 {
    fun bad(req: HttpServletRequest) {
        val session: Session = factory.openSession()
        val name: String = req.getParameter("name")
        val query = session.createQuery("from Student where Name = '$name'")
        query.list()
    }

    fun good(req: HttpServletRequest) {
        val session: Session = factory.openSession()
        val name: String = req.getParameter("name")
        val query = session.createQuery("from Student where Name = ?")
        query.setString(0, name)
        query.list()
    }

    companion object {
        private val factory: SessionFactory = Configuration().buildSessionFactory()
    }
}