package edu.cumberlands.trainer.trainermanagment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.cumberlands.trainer.trainermanagment.model.Trainer;
import edu.cumberlands.trainer.trainermanagment.service.TrainerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/trainer")
@Api(value = "Trainer Controller", produces = MediaType.APPLICATION_JSON_VALUE)
public class TrainerController {
	
	@Autowired
	private TrainerService trainerService;
	
	@PostMapping("/save")
	@ApiResponses (value = {@ApiResponse(code = 200, message = "OK", response = ResponseEntity.class)})
	public ResponseEntity<?> saveTrainer(@RequestBody Trainer trainer){
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		if(null != trainer) {
			map.put("Saved Trainer", trainerService.saveTrainer(trainer));
			response = new ResponseEntity<>(map, HttpStatus.OK);
		}else {
			map.put("Trainer not Saved","Check Input");
			response = new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}		
		return response;		
	}
	
	@GetMapping("/get/{trainerId}")
	@ApiOperation("Trainer ")
	@ApiResponses(value = {@ApiResponse(code=200,message = "OK", response = ResponseEntity.class)})
	public ResponseEntity<?> getTrainer(@PathVariable Long trainerId){
		ModelMap map = new ModelMap();
		ResponseEntity<?> response ;
		if( null != trainerId) {
			map.put("Trainer details requested", trainerService.getTrainer(trainerId));
			response = new ResponseEntity<>(map, HttpStatus.OK);
			}else {
			map.put("Bad Request","Check input");
			response = new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
			}	
		return response;		
	}
	
	@GetMapping("/getAll")
	@ApiOperation("Get all Trainer ")
	@ApiResponses(value = {@ApiResponse(code=200,message = "OK", response = ResponseEntity.class)})
	public ResponseEntity<?> getAllTrainer(){
		ModelMap map = new ModelMap();
		ResponseEntity<?> response ;
		map.put("Trainer details requested", trainerService.getAllTrainer());
		response = new ResponseEntity<>(map, HttpStatus.OK);
		return response;		
	}
	
	@DeleteMapping("/delete/{tarinerId}")
	@ApiOperation("Delete Trainer by trainerID")
	@ApiResponses(value = {@ApiResponse(code=200,message = "OK", response = ResponseEntity.class)})
	public ResponseEntity<?> deleteTrainer(@PathVariable Long trainerId){
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		if( null != trainerId) {
			trainerService.deleteTrainer(trainerId);
			map.put("Trainer Deleted of ID","{trainerId}");
			response = new ResponseEntity<>(map,HttpStatus.OK);
		}else {
			map.put("Bad Request","Check for Input");
			response = new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
		}
		return response;
	} 
	
	@PutMapping("/update")
	@ApiOperation("Update Trainer")
	@ApiResponses (value = {@ApiResponse(code = 200, message = "OK", response = ResponseEntity.class)})
	public ResponseEntity<?> updateTrainer(@RequestBody Trainer trainer){
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		if(null != trainer) {
			map.put("Saved Trainer", trainerService.saveTrainer(trainer));
			response = new ResponseEntity<>(map, HttpStatus.OK);
		}else {
			map.put("Trainer not Saved","Check Input");
			response = new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}		
		return response;		
	}
	
	
	


}
