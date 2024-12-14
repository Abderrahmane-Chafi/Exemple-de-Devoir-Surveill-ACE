package service;

import org.sid.exemplededevoirsurveille1.dao.repositories.AvionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sid.exemplededevoirsurveille1.dao.entities.Avion;

@Service

public class AvionManager implements AvionService {
    @Autowired
    private AvionRepository avionRepository;

    @Override
    public Avion findByModel(String model) {
        return avionRepository.findByModel(model).orElse(null);
    }

    @Override
    public Avion findByModelAndPrice(String model, Float price) {
        return avionRepository.findByModelAndPrice(model, price).orElse(null);
    }

    @Override
    public Avion saveAvion(Avion avionRequest) {
        return avionRepository.save(avionRequest);
    }

    @Override
    public boolean deleteAvionById(Integer id) {
        if (avionRepository.existsById(id)) {
            avionRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
