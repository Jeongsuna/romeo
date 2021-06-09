package testcases.C7009_IMPRXMLEXTENT_CWE611;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class C7009_IMPRXMLEXTENT_CWE611_simple {
    public void bad() throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        //secure.xml 파일을 읽어서 파싱한다.
        /* FLAW: CWE-611 */
        saxParser.parse(new FileInputStream("secure.xml"),new DefaultHandler());
    }

    public void good() throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl",true);
        File file = new File("secure.xml");
        saxParser.parse(new FileInputStream(file),new DefaultHandler());
    }
}
