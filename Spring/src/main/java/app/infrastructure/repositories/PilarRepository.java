package app.infrastructure.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import app.infrastructure.entities.PilarEntity;

public interface PilarRepository extends JpaRepository<PilarEntity, Long>{

	Optional<PilarEntity> findById(Long id);
}
