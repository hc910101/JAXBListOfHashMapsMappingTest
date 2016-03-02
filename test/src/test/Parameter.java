package test;

import java.util.Map;

import org.w3c.dom.Element;

import com.jcabi.xml.XMLDocument;

public class Parameter {
	protected Map<String,String> properties;

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}
	@Override
	public String toString(){
		return "Parameter["+properties.toString()+"]";
	}
}
