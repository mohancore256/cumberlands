package edu.cumberlands.batch.batchmanagment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cumberlands.batch.batchmanagment.model.Batch;
import edu.cumberlands.batch.batchmanagment.repository.BatchRepository;

@Service
public class BatchService {
	
	@Autowired
	private BatchRepository batchRepository;
	
	public Batch saveBatch(Batch batch) {
		return batchRepository.save(batch);
	}
	
	public Optional<Batch> getBatch(Long batchId){
		return batchRepository.findById(batchId);
	}
	
	public void deleteBatch(Long batchId) {
		batchRepository.deleteById(batchId);
	}
	
	public Batch updateBatch(Batch batch) {
		return batchRepository.save(batch);
	}
	
	public List<Batch> getAllBatch(){
		return batchRepository.findAll();
	}
	
	
	

}
