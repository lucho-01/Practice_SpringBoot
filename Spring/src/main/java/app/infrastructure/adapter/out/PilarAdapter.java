package app.infrastructure.adapter.out;

import java.util.Optional;

import org.springframework.stereotype.Component;

import app.domain.models.Pilar;
import app.domain.ports.PilarPort;
import app.infrastructure.entities.PilarEntity;
import app.infrastructure.mappers.PilarMapper;
import app.infrastructure.repositories.PilarRepository;

@Component   // 🔥 IMPORTANTE
public class PilarAdapter implements PilarPort {
	
	private PilarMapper pilarMapper;
	private PilarRepository pilarRepository;
	

	@Override
	public Pilar findById(Pilar pilar) throws Exception{
	Optional<PilarEntity> PilarEntity = pilarRepository.findById(pilar.getId());
	return PilarMapper.toDomain(PilarEntity.get());
    }


	@Override
	public Pilar update(Pilar pilar) throws Exception {

	    Optional<PilarEntity> existingOpt = pilarRepository.findById(pilar.getId());

	    if (!existingOpt.isPresent()) {
	        throw new Exception("No se encontró el pilar con id: " + pilar.getId());
	    }

	    PilarEntity entity = existingOpt.get();

	    entity.setName(pilar.getName());
	    entity.setPosX(pilar.getPosX());
	    entity.setPosY(pilar.getPosY());
	    entity.setStatus(pilar.getStatus());

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

