package test;

import java.util.List;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.w3c.dom.Element;

import com.jcabi.xml.XMLDocument;
 @XmlRootElement(name="Doc")
 public class Doc 
 { 
/*
	@XmlElementWrapper(name="parameters")
	@XmlElement(name="parameter")
	protected List<Parameter2> parameters;

	@Override
	public String toString() {
		return "Doc [Parameters=" + parameters + "]";
	}
*/
	 @XmlJavaTypeAdapter(ParametersAdapter.class)
	 protected Parameters parameters;
		@Override
		public String toString() {
			return "Doc [Parameters=" + parameters + "]";
		}
 } 