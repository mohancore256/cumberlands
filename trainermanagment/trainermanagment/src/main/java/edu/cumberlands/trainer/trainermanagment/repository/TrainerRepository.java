package edu.cumberlands.trainer.trainermanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cumberlands.trainer.trainermanagment.model.Trainer;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long>{

}
