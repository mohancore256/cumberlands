package edu.cumberlands.batch.batchmanagment.model;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Batch {
	
	private Long batchId;
	
	private Long courseId;
	
	private Long tarinerId;
	
	private Integer Duration;
	
	private Date startOfDate;
	
	private Date endOfDate;
	
	private Double totalFee;

}
