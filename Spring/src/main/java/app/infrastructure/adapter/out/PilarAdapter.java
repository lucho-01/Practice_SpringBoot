package app.infrastructure.adapter.out;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.domain.models.Pilar;
import app.domain.ports.PilarPort;
import app.infrastructure.entities.PilarEntity;
import app.infrastructure.mappers.PilarMapper;
import app.infrastructure.repositories.PilarRepository;

@Component
public class PilarAdapter implements PilarPort {

	@Autowired
    private final PilarMapper pilarMapper;
	@Autowired
    private final PilarRepository pilarRepository;

    // 🔥 Inyección por constructor
    public PilarAdapter(PilarMapper pilarMapper, PilarRepository pilarRepository) {
        this.pilarMapper = pilarMapper;
        this.pilarRepository = pilarRepository;
    }

    @Override
    public Pilar findById(Pilar pilar) throws Exception {
        Optional<PilarEntity> pilarEntity = pilarRepository.findById(pilar.getId());

        if (!pilarEntity.isPresent()) {
            throw new Exception("No se encontró el pilar con id: " + pilar.getId());
        }

        return pilarMapper.toDomain(pilarEntity.get());
    }

    @Override
    public Pilar update(Pilar pilar) throws Exception {

        PilarEntity entity = pilarRepository.findById(pilar.getId())
            .orElseThrow(() -> new Exception("No existe el pilar con ese id"));

        // ⬅ actualizas SOLO el entity real (el que viene de la BD)
        entity.setName(pilar.getName());
        entity.setPosX(pilar.getPosX());
        entity.setPosY(pilar.getPosY());
        entity.setStatus(pilar.getStatus());

        // ⬅ save del entity REAL que ya está en estado managed
        PilarEntity updated = pilarRepository.save(entity);

        return pilarMapper.toDomain(updated);
    }

    @Override
    public Pilar save(Pilar pilar) throws Exception {
        PilarEntity pilarEntity = pilarMapper.toEntity(pilar);

        pilarRepository.save(pilarEntity);

        return pilar;
    }
}