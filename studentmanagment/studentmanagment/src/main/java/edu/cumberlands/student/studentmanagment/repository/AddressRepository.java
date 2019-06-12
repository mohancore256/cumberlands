package edu.cumberlands.student.studentmanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cumberlands.student.studentmanagment.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
