package test;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

 @XmlRootElement(name="Doc")
 public class Doc 
 { 
	 @XmlJavaTypeAdapter(ParametersAdapter.class)
	 protected Parameters parameters;
		@Override
		public String toString() {
			return "Doc [Parameters=" + parameters + "]";
		}
 } 