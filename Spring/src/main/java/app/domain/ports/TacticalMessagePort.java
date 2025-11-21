package app.domain.ports;

import app.domain.models.TacticalMessage;

public interface TacticalMessagePort {

	TacticalMessage findById(TacticalMessage tacticalMessage) throws Exception; 
	TacticalMessage update(TacticalMessage tacticalMessage) throws Exception; 
	TacticalMessage save(TacticalMessage tacticalMessage) throws Exception; 
}
