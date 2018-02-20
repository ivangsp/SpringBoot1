package com.example.demo;

import com.example.demo.models.PlantInventoryEntry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		PlantInventoryEntry entry = new PlantInventoryEntry();
		entry.setName("Bike");
		entry.setDescription("Nice and shinny");
		entry.setPrice(new BigDecimal(100));
		System.out.println(entry);
	}
}
