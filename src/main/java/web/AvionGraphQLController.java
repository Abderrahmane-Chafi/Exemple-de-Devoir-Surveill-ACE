package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.AvionService;
import org.sid.exemplededevoirsurveille1.dao.entities.Avion;

@RestController
@RequestMapping("/graphql")
public class AvionGraphQLController {
    @Autowired
    private AvionService avionService;

    // Query: Get Avion by Model
    @PostMapping("/getAvionByModel")
    public ResponseEntity<Avion> getAvionByModel(@RequestParam String model) {
        Avion avion = avionService.findByModel(model);
        return ResponseEntity.ok(avion);
    }

    // Query: Get Avion by Model and Price
    @PostMapping("/getAvionByModelAndPrice")
    public ResponseEntity<Avion> getAvionByModelAndPrice(@RequestParam String model, @RequestParam Float price) {
        Avion avion = avionService.findByModelAndPrice(model, price);
        return ResponseEntity.ok(avion);
    }

    // Mutation: Save Avion
    @PostMapping("/saveAvion")
    public ResponseEntity<Avion> saveAvion(@RequestBody Avion avionRequest) {
        Avion savedAvion = avionService.saveAvion(avionRequest);
        return ResponseEntity.ok(savedAvion);
    }

    // Mutation: Delete Avion
    @PostMapping("/deleteAvion")
    public ResponseEntity<String> deleteAvion(@RequestParam Integer id) {
        boolean isDeleted = avionService.deleteAvionById(id);
        if (isDeleted) {
            return ResponseEntity.ok("Avion successfully deleted");
        } else {
            return ResponseEntity.status(404).body("Avion not found");
        }
    }
}
