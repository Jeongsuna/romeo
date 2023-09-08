package testcases.C00A5_XMLVALIDITY__CWE112;

import org.w3c.dom.Document;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;

public class C00A5_XMLVALIDITY__sample_01 {

    public void bad() {

        try {

            DocumentBuilderFactory foo = DocumentBuilderFactory.newInstance();
            foo.setValidating(false);
            Document c_dom = foo.newDocumentBuilder().parse("sample.xml");


        } catch (Exception ex) {


        }

    }

    public void good() {
        try {

            DocumentBuilderFactory foo = DocumentBuilderFactory.newInstance();
            foo.setValidating(true);
            Document c_dom = foo.newDocumentBuilder().parse("sample.xml");
        } catch (Exception ex) {

        }
    }


}
