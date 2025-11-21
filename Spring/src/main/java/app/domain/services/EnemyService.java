package app.domain.services;

import app.domain.models.Enemy;
import app.domain.ports.EnemyPort;

public class EnemyService {
	private EnemyPort enemyPort;

	public void createEnemy(Enemy enemy) throws Exception {

		if (enemyPort.findById(enemy) == null) {
			throw new Exception("No existe un enemigo con ese id");
		}
		
		enemyPort.save(enemy);
	}
}
