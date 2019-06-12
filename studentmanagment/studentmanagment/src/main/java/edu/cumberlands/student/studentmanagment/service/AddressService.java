package edu.cumberlands.student.studentmanagment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cumberlands.student.studentmanagment.model.Address;
import edu.cumberlands.student.studentmanagment.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	private Address saveAddress(Address address) {
		return addressRepository.save(address);
	}
	
	private Optional<Address> getAddress(Long addressId){
		return addressRepository.findById(addressId);
	}
	
	private void deleteAddress(Long addressId) {
		 addressRepository.deleteById(addressId);
	}
	
	private Address update(Address address) {
		//check if address is already exsicted
//		if(address.getAddressId()) {
//			
//		}
		return saveAddress(address);
	}

}
