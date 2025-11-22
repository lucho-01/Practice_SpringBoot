package app.infrastructure.adapter.in.validators;

import org.springframework.stereotype.Component;

import app.domain.models.enums.Status;

@Component
public class PilarValidator extends SimpleValidator{

	public String nameValidator(String value) throws Exception{
		return stringValidator("el nombre del pilar", value);
	}
	
	public String positionYValidator(String value) throws Exception{
		return stringValidator("la posición en Y del pilar", value);
	}
	
	public String positionXValidator(String value) throws Exception{
		return stringValidator("la posición en X del pilar", value);
	}
	
	public Status statusValidator(String value) throws Exception{
		stringValidator("El estado del pilar", value);
		return Status.valueOf(value);
	}
}
