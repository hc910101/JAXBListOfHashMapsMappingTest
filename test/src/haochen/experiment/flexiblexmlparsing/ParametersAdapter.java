package haochen.experiment.flexiblexmlparsing;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.DOMOutputter;
import org.w3c.dom.Element;

 
 
 public class ParametersAdapter extends XmlAdapter<RawXmlParameters, Parameters> {

 public RawXmlParameters marshal(Parameters val) throws Exception { 
	 String s="";
	 List<Parameter> parameters=val.getParameters();
	 SAXBuilder builder=new SAXBuilder();
	 DOMOutputter outputter = new DOMOutputter();
	 RawXmlParameters rawXmlParameters=new RawXmlParameters();
	 List<RawXmlParameter> rawXmlParametersList=new ArrayList<RawXmlParameter>();
	 for(Parameter parameter:parameters)
	 {
		 RawXmlParameter rawXmlParameter=new RawXmlParameter();
		 Map<String,String> propertiesMap=parameter.getProperties();
		 
		 List<Element> elementList=new ArrayList<Element>();
		 for(Entry<String, String> entry:propertiesMap.entrySet())
		 {
			 
			 s="<"+entry.getKey()+">";
			 s+=entry.getValue();
			 s+="</"+entry.getKey()+">";
			 Document doc = builder.build(new StringReader(s));
			 org.jdom2.Element jdomElement=doc.getRootElement();
			 Element element=outputter.output(jdomElement);
			 elementList.add(element);
		 }
		 rawXmlParameter.setProperties(elementList);
		 rawXmlParametersList.add(rawXmlParameter);
		 
	 }
	 rawXmlParameters.setParameters(rawXmlParametersList);
	 return rawXmlParameters;
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