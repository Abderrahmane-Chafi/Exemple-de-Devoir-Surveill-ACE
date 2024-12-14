package org.sid.exemplededevoirsurveille1.dao.repositories;

import org.sid.exemplededevoirsurveille1.dao.entities.Avion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface AvionRepository extends JpaRepository<Avion, Integer> {
    Optional<Avion> findByModel(String model);
    Optional<Avion> findByModelAndPrice(String model, Float price);
}
