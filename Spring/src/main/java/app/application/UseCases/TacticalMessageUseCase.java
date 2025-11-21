package app.application.UseCases;

import app.domain.models.TacticalMessage;
import app.domain.services.TacticalMessageService;

public class TacticalMessageUseCase {

	private TacticalMessageService tacticalMessageService;
	
	public void createTacticalMessage(TacticalMessage tacticalMessage) throws Exception{
		
		tacticalMessageService.createTacticalMessage(tacticalMessage);
	}
	
	public void updateTacticalMessage(TacticalMessage tacticalMessage) throws Exception{
		
		tacticalMessageService.updateTacticalMessage(tacticalMessage);
	}
}
