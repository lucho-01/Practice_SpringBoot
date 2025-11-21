package app.application.UseCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.models.Pilar;
import app.domain.services.PilarService;

@Service
public class PilarUseCase {

	@Autowired
	private PilarService pilarService;
	
	public void createPilar(Pilar pilar) throws Exception{
		pilarService.createPilar(pilar);
	}
	
	public void updatePilar(Pilar pilar) throws Exception{
		pilarService.updatePilar(pilar);
	}
	
}
