package haochen.experiment.flexiblexmlparsing;
import java.util.List;
import javax.xml.bind.annotation.XmlAnyElement;
import org.w3c.dom.Element;

import com.jcabi.xml.XMLDocument;

public class RawXmlParameter {
	
	protected List<Element> properties;
	
	@XmlAnyElement
    public List<Element> getProperties() {
		return properties;
	}
	public void setProperties(List<Element> properties) {
		this.properties = properties;
	}
	public RawXmlParameter(){
    }
	@Override
	public String toString() {
		String string="Parameter [";
		for(Element element:properties)
		{
			String xml = new XMLDocument(element).toString();
			string+=xml;
		};
		return string=string+"]";
	}
    
}
