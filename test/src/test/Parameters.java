package test;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Parameters {
	
	
	protected List<Parameter> parameters;

	@XmlElement(name="parameter")
	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}
	@Override
	public String toString()
	{
		String string="";
		for(Parameter paremeter:parameters)
		{
			string+=paremeter.toString();
		}
		return string;
	}
}
