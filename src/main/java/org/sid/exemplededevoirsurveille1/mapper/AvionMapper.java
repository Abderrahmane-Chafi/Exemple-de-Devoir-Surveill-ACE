package org.sid.exemplededevoirsurveille1.mapper;

import org.sid.exemplededevoirsurveille1.dto.AvionDTO;
import org.sid.exemplededevoirsurveille1.dao.entities.Avion;
import org.springframework.stereotype.Component;

@Component
public class AvionMapper {
    // Map Avion -> AvionDTO
    public AvionDTO toDto(Avion avion) {
        if (avion == null) {
            return null;
        }

        AvionDTO avionDTO = new AvionDTO();
        avionDTO.setModel(avion.getModel());
        avionDTO.setColor(avion.getColor());
        avionDTO.setMatricul(avion.getMatricul());
        avionDTO.setPrice(avion.getPrice());
        return avionDTO;
    }

    // Map AvionDTO -> Avion
    public Avion toEntity(AvionDTO avionDTO) {
        if (avionDTO == null) {
            return null;
        }

        Avion avion = new Avion();
        avion.setModel(avionDTO.getModel());
        avion.setColor(avionDTO.getColor());
        avion.setMatricul(avionDTO.getMatricul());
        avion.setPrice(avionDTO.getPrice());
        return avion;
    }
}
