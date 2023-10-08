package com.vishnu.Weektest.service;

import com.vishnu.Weektest.model.Address;
import com.vishnu.Weektest.model.Student;
import com.vishnu.Weektest.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
	@Autowired
	AddressRepo addressRepo;


	public String addAddress(Address address) {
		addressRepo.save(address);
		return "added";
	}

	public List<Address> getAddress() {
		return addressRepo.findAll();
	}

	public String updateAddress(String id, Address address) {
		addressRepo.save(address);
		return "updated";
	}

	public String delAddress(Long id) {
		addressRepo.deleteById(id);
		return "deleted";
	}
}
