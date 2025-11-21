package app.infrastructure.adapter.in.builders;

import app.domain.models.Enemy;
import app.infrastructure.adapter.in.validators.EnemyValidator;

public class EnemyBuilder {

	private EnemyValidator enemyValidator;
	
	public Enemy build(String name, String positionPossible, String ConfidenceLevel, String description) throws Exception{
		Enemy enemy= new Enemy();
		
	enemy.setName(enemyValidator.nameValidator(name));
	enemy.setPositionPossible(enemyValidator.positionPossibleValidator(positionPossible));
	enemy.setConfidenceLevel(enemyValidator.ConfidenceLevelValidator(ConfidenceLevel));
	enemy.setDescription(enemyValidator.descriptionValidator(description));
	
	return enemy;
	}
}
