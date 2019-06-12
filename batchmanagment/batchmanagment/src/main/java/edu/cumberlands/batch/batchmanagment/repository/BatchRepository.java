package edu.cumberlands.batch.batchmanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cumberlands.batch.batchmanagment.model.Batch;

@Repository
public interface BatchRepository extends JpaRepository<Batch, Long>{
    
	
}
