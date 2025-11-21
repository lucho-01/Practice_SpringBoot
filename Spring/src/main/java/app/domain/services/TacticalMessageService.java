package app.domain.services;

import app.domain.models.TacticalMessage;
import app.domain.ports.TacticalMessagePort;

public class TacticalMessageService {
	
	private TacticalMessagePort tacticalMessagePort;

	public void createTacticalMessage(TacticalMessage tacticalMessage) throws Exception {

		if (tacticalMessagePort.findById(tacticalMessage) == null) {
			throw new Exception("No existe un mensaje tactico con ese id");
		}
		
		tacticalMessagePort.save(tacticalMessage);
	}
	
	public void updateTacticalMessage(TacticalMessage tacticalMessage) throws Exception {

		if (tacticalMessagePort.findById(tacticalMessage) == null) {
			throw new Exception("No existe un mensaje tactico con ese id");
		}
		
		tacticalMessagePort.save(tacticalMessage);
	}
}
