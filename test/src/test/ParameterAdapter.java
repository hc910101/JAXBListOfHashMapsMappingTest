package test;

 import javax.xml.bind.annotation.adapters.XmlAdapter; 
 
 
 public class ParameterAdapter extends XmlAdapter<Parameter, Parameter2> {

 public Parameter marshal(Parameter2 val) throws Exception { 
	 return new Parameter();
 } 
 public Parameter2 unmarshal(Parameter val) throws Exception { 
	 return new Parameter2();
	 } 
 } 