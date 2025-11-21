package app.domain.ports;

import app.domain.models.Enemy;

public interface EnemyPort {
	
	Enemy findById(Enemy enemy)throws Exception;
	Enemy save(Enemy enemy)throws Exception;
}
