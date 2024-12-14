package service;
import org.sid.exemplededevoirsurveille1.dao.entities.Avion;

public interface AvionService {
    Avion findByModel(String model);
    Avion findByModelAndPrice(String model, Float price);
    Avion saveAvion(Avion avionRequest);
    boolean deleteAvionById(Integer id);
}
