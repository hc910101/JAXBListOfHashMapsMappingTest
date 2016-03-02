package test;

 import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.w3c.dom.Element; 
 
 
 public class ParametersAdapter extends XmlAdapter<RawXmlParameters, Parameters> {

 public RawXmlParameters marshal(Parameters val) throws Exception { 
	 return new RawXmlParameters();
 } 
 public Parameters unmarshal(RawXmlParameters val) throws Exception {
	List<RawXmlParameter> rawXmlParameters=val.getParameters();
	Parameters parameters=new Parameters();
	List<Parameter> list=new ArrayList<Parameter>();
	for(RawXmlParameter rawXmlParameter:rawXmlParameters)
	{
		List<Element>properties=new ArrayList<Element>();
		properties=rawXmlParameter.getProperties();
		Map<String,String> properties2=new HashMap<String,String>();
		for(Element element:properties)
		{
			properties2.put(element.getNodeName(), element.getTextContent());
		}
		Parameter parameter = new Parameter();
		parameter.setProperties(properties2);
		list.add(parameter);
	}
	 parameters.setParameters(list);
	 	return parameters;
	 } 
 } 