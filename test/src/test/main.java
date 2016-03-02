package test;

import java.io.StringReader;
import java.math.BigInteger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class main {
	public static void main(String[] args) throws JAXBException
	{
		

		JAXBContext jaxbContext = JAXBContext.newInstance(Doc.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

		StringReader reader = new StringReader("<Doc><parameters><parameter><aaa>213</aaa><bbb>213</bbb></parameter></parameters></Doc>");
		Doc zone = (Doc) unmarshaller.unmarshal(reader);
		System.out.println(zone);
	}
}
