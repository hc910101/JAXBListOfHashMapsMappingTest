package test;

 import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter; 
 
 
 public class ParametersAdapter extends XmlAdapter<Parameters, Parameters2> {

 public Parameters marshal(Parameters2 val) throws Exception { 
	 return new Parameters();
 } 
 public Parameters2 unmarshal(Parameters val) throws Exception { 
	 System.out.println("calling adapter");
	 System.out.println(val);
	 Parameters2 parameters2=new Parameters2();
	 Map<String,String> properties=new HashMap<String,String>();
	 properties.put("123", "123");
	 Parameter2 parameter2 = new Parameter2();
	 parameter2.setProperties(properties);
	 List<Parameter2> list=new ArrayList<Parameter2>();
	 list.add(parameter2);
	 parameters2.setParameters(list);
	 return parameters2;
	 } 
 } 