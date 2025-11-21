package app.infrastructure.adapter.in.builders;

import app.domain.models.TacticalMessage;
import app.infrastructure.adapter.in.validators.TacticalMessageValidator;

public class TacticalMessageBuilder {

	private TacticalMessageValidator tacticalMessageValidator;
	
	public TacticalMessage build(String pilarId, String contentFragmented, String conttentRebuilt, String timestamp) throws Exception{
		TacticalMessage tacticalMessage = new TacticalMessage();
	
		tacticalMessage.setContentFragmented(tacticalMessageValidator.contentFragmentedValidator(contentFragmented));
		tacticalMessage.setContentRebuilt(tacticalMessageValidator.contentRebuiltValidator(conttentRebuilt));
		tacticalMessage.setPilarId(tacticalMessageValidator.pilarIdValidator(pilarId));
		tacticalMessage.setTimestamp(tacticalMessageValidator.timestampValidator(timestamp));
		
		return tacticalMessage;
		
		
	}
}
