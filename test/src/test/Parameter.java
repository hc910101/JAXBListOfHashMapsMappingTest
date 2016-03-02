package test;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.w3c.dom.Element;

import com.jcabi.xml.XMLDocument;

public class Parameter {
	@XmlAnyElement
	protected List<Element> properties;
    public Parameter(){
    }
	@Override
	public String toString() {
		String string="Parameter [";
		System.out.println("toString");
		for(Element element:properties)
		{
			String xml = new XMLDocument(element).toString();
			System.out.println(xml);
			string+=xml;
		};
		return string=string+"]";
	}
    
}
