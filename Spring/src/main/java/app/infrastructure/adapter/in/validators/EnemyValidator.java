package app.infrastructure.adapter.in.validators;

public class EnemyValidator extends SimpleValidator{

	public String nameValidator(String value) throws Exception{
		return stringValidator("el nombre del enemigo", value);
	}
	
	public String positionPossibleValidator(String value) throws Exception{
		return stringValidator("la posición posible del enemigo", value);
	}
	
	public String descriptionValidator(String value) throws Exception{
		return stringValidator("la descripción del enemigo", value);
	}
	
	public String ConfidenceLevelValidator(String value) throws Exception{
		return stringValidator("El nivel de confianza del enemigo", value);
	}
}
