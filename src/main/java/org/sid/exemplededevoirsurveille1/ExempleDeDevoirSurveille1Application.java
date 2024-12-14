package org.sid.exemplededevoirsurveille1;

import org.sid.exemplededevoirsurveille1.dao.repositories.AvionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import org.sid.exemplededevoirsurveille1.dao.entities.Avion;

@SpringBootApplication
public class ExempleDeDevoirSurveille1Application {

	public static void main(String[] args) {
		SpringApplication.run(ExempleDeDevoirSurveille1Application.class, args);
	}
	@Bean
	CommandLineRunner start(AvionRepository avionRepository) {
		return args -> {
			List<Avion> avions = List.of(
					Avion.builder().model("Boeing 747").color("White").matricul("ABC123").price(1000000.0f).build(),
					Avion.builder().model("Airbus A320").color("Blue").matricul("XYZ456").price(750000.0f).build(),
					Avion.builder().model("Cessna 172").color("Red").matricul("DEF789").price(200000.0f).build(),
					Avion.builder().model("Concorde").color("Black").matricul("GHI101").price(3000000.0f).build()
			);
			avionRepository.saveAll(avions);

			System.out.println("Database has been initialized with 4 Avions using the Builder pattern.");
		};
	}
}
