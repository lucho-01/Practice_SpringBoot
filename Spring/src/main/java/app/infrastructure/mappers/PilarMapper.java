package app.infrastructure.mappers;

import org.springframework.stereotype.Component;

import app.domain.models.Pilar;
import app.infrastructure.entities.PilarEntity;

@Component
public class PilarMapper {

    public static Pilar toDomain(PilarEntity entity) {
        if (entity == null) {
            return null;
        }

        Pilar pilar = new Pilar();
        pilar.setId(entity.getId());
        pilar.setName(entity.getName());
        pilar.setPosX(entity.getPosX());
        pilar.setPosY(entity.getPosY());
        pilar.setStatus(entity.getStatus());

        return pilar;
    }

    public PilarEntity toEntity(Pilar domain) {
        if (domain == null) {
            return null;
        }

        PilarEntity entity = new PilarEntity();
        entity.setId(domain.getId());
        entity.setName(domain.getName());
        entity.setPosX(domain.getPosX());
        entity.setPosY(domain.getPosY());
        entity.setStatus(domain.getStatus());

        return entity;
    }
}

