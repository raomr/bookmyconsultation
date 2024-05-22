package com.upgrad.bookmyconsultation.controller;

import com.upgrad.bookmyconsultation.entity.Rating;
import com.upgrad.bookmyconsultation.service.RatingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
public class RatingsController {

	@Autowired
	private RatingsService ratingsService;


	//create a post method named submitRatings with return type as ResponseEntity
		//define the method parameter rating of type Rating, use @RequestBody for mapping
		
		//submit the ratings
	
		//return http response with status set to OK
	@PostMapping("/ratings")
	public ResponseEntity submitRatings(@RequestBody Rating inputRating){
		ratingsService.submitRatings(inputRating);
		return new ResponseEntity("Ratings saved", HttpStatus.OK);

	}
	
}
