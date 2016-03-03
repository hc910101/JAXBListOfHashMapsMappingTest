package test;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class MainClass {
	public static void main(String[] args) throws JAXBException
	{
		

		JAXBContext jaxbContext = JAXBContext.newInstance(Doc.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Marshaller marshaller=jaxbContext.createMarshaller();
		StringReader reader = new StringReader("<Doc><parameters><parameter><aaa>213</aaa><bbb>213</bbb></parameter><parameter><ccc>geaag</ccc><ddd>egaed</ddd></parameter></parameters></Doc>");
		Doc zone = (Doc) unmarshaller.unmarshal(reader);
		System.out.println(zone);
		marshaller.marshal(zone, System.out);
		
	}
}
