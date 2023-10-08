package com.vishnu.Weektest.controller;

import com.vishnu.Weektest.model.Address;
import com.vishnu.Weektest.model.Laptop;
import com.vishnu.Weektest.service.LaptopService;
import com.vishnu.Weektest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
	@Autowired
	LaptopService laptopService;

	@PostMapping("laptop")
	public String addLap(@RequestBody Laptop laptop){
		return laptopService.addLap(laptop);
	}
	@GetMapping("laptop")
	public List<Laptop> getLaptops(){
		return laptopService.getLaptops();
	}
	@PutMapping("laptop/{id}")
	public String updateLaptop(@PathVariable String id,@RequestBody Laptop laptop){
		return laptopService.updateLaptop(id,laptop);
	}
	@DeleteMapping("laptop/{id}")
	public String delLaptop(@PathVariable String id){
		return laptopService.delLaptop(id);
	}
}
