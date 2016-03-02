package test;

import java.util.ArrayList;
import java.util.List;

public class Parameters {
	protected List<Parameter> parameters;
	
	public Parameters() {
		parameters=new ArrayList<Parameter>();
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}

	@Override
	public String toString()
	{
		String string="[";
		for(Parameter paremeter:parameters)
		{
			string+=paremeter.toString();
		}
		return string+"]";
	}
}
