package haochen.experiment.flexiblexmlparsing;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class RawXmlParameters {
	
	
	protected List<RawXmlParameter> rawXmlParameters;

	@XmlElement(name="parameter")
	public List<RawXmlParameter> getParameters() {
		return rawXmlParameters;
	}

	public void setParameters(List<RawXmlParameter> rawXmlParameters) {
		this.rawXmlParameters = rawXmlParameters;
	}
	@Override
	public String toString()
	{
		String string="";
		for(RawXmlParameter paremeter:rawXmlParameters)
		{
			string+=paremeter.toString();
		}
		return string;
	}
}
