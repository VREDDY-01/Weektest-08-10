package com.vishnu.Weektest.service;

import com.vishnu.Weektest.model.Laptop;
import com.vishnu.Weektest.repo.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
	@Autowired
	LaptopRepo laptopRepo;

	public String addLap(Laptop laptop) {
		laptopRepo.save(laptop);
		return "saved";
	}

	public List<Laptop> getLaptops() {
		return laptopRepo.findAll();
	}

	public String updateLaptop(String id, Laptop laptop) {
		laptop.setID(id);
		laptopRepo.save(laptop);
		return "updated";
	}

	public String delLaptop(String id) {
		laptopRepo.deleteById(id);
		return "deleted";
	}
}
