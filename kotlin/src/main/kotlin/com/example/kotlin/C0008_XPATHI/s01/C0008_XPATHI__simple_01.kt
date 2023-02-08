package com.example.kotlin.C0008_XPATHI.s01

import org.w3c.dom.NodeList
import org.xml.sax.SAXException
import java.io.IOException
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.parsers.ParserConfigurationException
import javax.xml.xpath.XPathConstants
import javax.xml.xpath.XPathExpressionException
import javax.xml.xpath.XPathFactory
import javax.xml.xpath.XPath
class C0008_XPATHI__simple_01 {
    fun bad(args: Array<String>) {
        val name = args[0]
        try {
            val docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder()
            val doc = docBuilder.parse("http://www.w3schools.com/xml/simple.xml")
            val xpath: XPath = XPathFactory.newInstance().newXPath()
            /* FLAW : CWE-643 */
            val nodes = xpath.evaluate(
                "//food[name='$name']/price",
                doc, XPathConstants.NODESET
            ) as NodeList
            for (i in 0 until nodes.length) {
                println(nodes.item(i).textContent)
            }
        } catch (e: ParserConfigurationException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        } catch (e: XPathExpressionException) {
            e.printStackTrace()
        } catch (e: SAXException) {
            e.printStackTrace()
        }
    }

    fun good(args: Array<String>) {
        var name = args[0]
        if (name != null) {
            name = name.replace("[()\\-'\\[\\]:,*/]".toRegex(), "")
        }
        try {
            val docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder()
            val doc = docBuilder.parse("http://www.w3schools.com/xml/simple.xml")
            val xpath: XPath = XPathFactory.newInstance().newXPath()
            val nodes = xpath.evaluate("//food[name='$name']/price", doc, XPathConstants.NODESET) as NodeList
            for (i in 0 until nodes.length) {
                println(nodes.item(i).textContent)
            }
        } catch (e: ParserConfigurationException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        } catch (e: XPathExpressionException) {
            e.printStackTrace()
        } catch (e: SAXException) {
            e.printStackTrace()
        }
    }
}