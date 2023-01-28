package com.training.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.app.dto.InstructorDTODefaultResponse;
import com.training.app.entity.Instructor;
import com.training.app.service.instructor.InstructorService;
import com.training.app.util.InstructorDTOConvertor;

@RestController
@RequestMapping("/trainer")
public class IntructorRestController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	InstructorService instructorService;
	
	@Autowired
	InstructorDTOConvertor dtoConvertor;
	
	
	public IntructorRestController() {
		logger.info("Instructor Rest Controller called");
		System.err.println("Instructor Rest Controller called");
	}

	@PostMapping("/register")
	public ResponseEntity<InstructorDTODefaultResponse> saveTrainer(@RequestBody Instructor intructor)
	{
		Instructor savedInstructror = instructorService.registerTrainer(intructor);
		logger.info(" --->> Instructor saved "+savedInstructror);
		
		InstructorDTODefaultResponse dtoObj = dtoConvertor.convertTo(savedInstructror);
		
		
		return new ResponseEntity<InstructorDTODefaultResponse>(dtoObj,HttpStatus.OK);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<InstructorDTODefaultResponse>> getAllTrainers()
	{
		List<Instructor> allInstructorsInDB = instructorService.getAllTrainer();
		
		List<InstructorDTODefaultResponse> dtoList = new ArrayList<>();
		for (Instructor instructor : allInstructorsInDB) {
			
			InstructorDTODefaultResponse dtoObj = dtoConvertor.convertTo(instructor);
			dtoList.add(dtoObj);
		}
		
		return new ResponseEntity<List<InstructorDTODefaultResponse>>(dtoList,HttpStatus.OK);
	}
	
	
	@PutMapping("/{tid}/course/{cid}")
	public String updateTrainerWithCourse(@PathVariable int tid,@PathVariable int cid)
	{
		Instructor updatedInstructor = instructorService.updateCourse(tid, cid);
		
		if(updatedInstructor.getCourse() != null)
		{
			return updatedInstructor.toString();
		}
		else return "error : - "+updatedInstructor.toString()+" ";
	}
	
	
	
}//end class











