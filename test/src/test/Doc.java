package test;

import java.util.List;

import javax.xml.bind.annotation.*;

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
	 @XmlElement(name="parameters")
	 protected Parameters parameters;
		@Override
		public String toString() {
			return "Doc [Parameters=" + parameters + "]";
		}
 } 