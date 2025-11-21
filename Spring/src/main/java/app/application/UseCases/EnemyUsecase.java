package app.application.UseCases;

import app.domain.models.Enemy;
import app.domain.services.EnemyService;

public class EnemyUsecase {

	private EnemyService enemyService;
	
	public void createEnemy(Enemy enemy) throws Exception{
		enemyService.createEnemy(enemy);
	}
}
