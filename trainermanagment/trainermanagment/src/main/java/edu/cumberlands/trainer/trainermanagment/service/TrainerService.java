package edu.cumberlands.trainer.trainermanagment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cumberlands.trainer.trainermanagment.model.Trainer;
import edu.cumberlands.trainer.trainermanagment.repository.TrainerRepository;

@Service
public class TrainerService {
	
	@Autowired
	private TrainerRepository trainerRepository;
	
	public Trainer saveTrainer(Trainer trainer) {
		return trainerRepository.save(trainer);
	}
	
	public Optional<Trainer> getTrainer(Long trainerId) {
		return trainerRepository.findById(trainerId);
	}
	
	public List<Trainer> getAllTrainer(){
		return trainerRepository.findAll();
	}
	
	public void deleteTrainer(Long trainerId) {
		 trainerRepository.deleteById(trainerId);	
	}
	
	public Trainer update(Trainer trainer) {
		return trainerRepository.save(trainer);
	}
	
	

}
