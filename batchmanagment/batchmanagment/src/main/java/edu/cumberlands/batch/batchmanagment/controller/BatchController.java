package edu.cumberlands.batch.batchmanagment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.cumberlands.batch.batchmanagment.model.Batch;
import edu.cumberlands.batch.batchmanagment.service.BatchService;

@RestController
@RequestMapping(value = "/batch")
public class BatchController {

	@Autowired
	private BatchService batchService;

	@PostMapping("/save")
	public ResponseEntity<?> saveBatch(@RequestBody Batch batch) {
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		if (null != batch) {
			map.put("Batch Saved", batchService.saveBatch(batch));
			response = new ResponseEntity<>(map, HttpStatus.OK);
		} else {
			map.put("Batch not Saved", "OOPS something went wrong");
			response = new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	@GetMapping("/get/{batchId}")
	public ResponseEntity<?> getBatch(@PathVariable Long batchId) {
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		if (null != batchId) {
			map.put("Batch details requested", batchService.getBatch(batchId));
			response = new ResponseEntity<>(map, HttpStatus.OK);
		} else {
			map.put("Batch not Saved", "OOPS something went wrong");
			response = new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	@GetMapping("/getAll")
	public ResponseEntity<?> getAllBatch() {
		ModelMap map = new ModelMap();
		map.put("List of Batch",batchService.getAllBatch());
		ResponseEntity<?> response = new ResponseEntity<>(map, HttpStatus.OK);		
		return response;
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateBatch(@RequestBody Batch batch){
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		if (null != batch) {
			map.put("Batch Saved", batchService.saveBatch(batch));
			response = new ResponseEntity<>(map, HttpStatus.OK);
		} else {
			map.put("Batch not Saved", "OOPS something went wrong");
			response = new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
		return response;
	} 

}
