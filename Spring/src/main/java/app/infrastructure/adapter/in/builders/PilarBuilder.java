package app.infrastructure.adapter.in.builders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.domain.models.Pilar;
import app.infrastructure.adapter.in.validators.PilarValidator;

@Component
public class PilarBuilder {

	@Autowired
	private PilarValidator pilarValidator;
	
	public Pilar build(String name, String posX, String posY, String status) throws Exception{
		Pilar pilar= new Pilar();
		
		pilar.setName(pilarValidator.nameValidator(name));
		pilar.setPosX(pilarValidator.positionXValidator(posX));
		pilar.setPosY(pilarValidator.positionYValidator(posX));
		pilar.setStatus(pilarValidator.statusValidator(status));
		
		return pilar;
	}
}
