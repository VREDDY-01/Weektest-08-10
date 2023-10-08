package com.vishnu.Weektest.controller;

import com.vishnu.Weektest.model.Address;
import com.vishnu.Weektest.model.Student;
import com.vishnu.Weektest.service.AddressService;
import com.vishnu.Weektest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
	@Autowired
	AddressService addressService;

	@PostMapping("address")
	public String addAddress(@RequestBody Address address){
		return addressService.addAddress(address);
	}
	@GetMapping("address")
	public List<Address> getAddress(){
		return addressService.getAddress();
	}
	@PutMapping("address/{id}")
	public String updateAddress(@PathVariable String id,@RequestBody Address address){
		return addressService.updateAddress(id,address);
	}
	@DeleteMapping("address/{id}")
	public String delAddress(@PathVariable Long id){
		return addressService.delAddress(id);
	}
}
