package app.infrastructure.adapter.in.validators;

public class TacticalMessageValidator extends SimpleValidator{

	public String contentFragmentedValidator(String value) throws Exception{
		return stringValidator("El contenido fragmentado del mensaje", value);
	}
	
	public String contentRebuiltValidator(String value) throws Exception{
		return stringValidator("El contenido reconstruido del mensaje", value);
	}
	
	public String timestampValidator(String value) throws Exception{
		return stringValidator("La marca de tiempo del mensaje", value);
	}
	
	public long pilarIdValidator(String value) throws Exception{
		return longValidator("La marca de tiempo del mensaje", value);
	}
}
