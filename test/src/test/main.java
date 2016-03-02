package test;

import java.io.StringReader;
import java.math.BigInteger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class main {
	public static void main(String[] args) throws JAXBException
	{
		

		JAXBContext jaxbContext = JAXBContext.newInstance(Zone.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

		StringReader reader = new StringReader("<Zone><name>123</name><startCoord><x>123</x><y>421</y></startCoord><endCoord><x>123</x><y>421</y></endCoord></Zone>");
		Zone zone = (Zone) unmarshaller.unmarshal(reader);
		System.out.println(zone);
	}
}
