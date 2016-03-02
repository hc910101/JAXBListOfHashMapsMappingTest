package test;

import java.util.ArrayList;
import java.util.List;

public class Parameters2 {
	protected List<Parameter2> parameters;
	
	public Parameters2() {
		parameters=new ArrayList<Parameter2>();
	}

	public List<Parameter2> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter2> parameters) {
		this.parameters = parameters;
	}

	@Override
	public String toString()
	{
		String string="[";
		for(Parameter2 paremeter:parameters)
		{
			string+=paremeter.toString();
		}
		return string+"]";
	}
}
