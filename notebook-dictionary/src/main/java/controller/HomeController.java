package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Term;

@RestController
@RequestMapping("/")
public class HomeController {

	Term sample = new Term();
	
	@GetMapping("home")
	public ResponseEntity<Term> homePoint(){
		sample.setTermId(1000);
		sample.setTermName("Sample");
		sample.setCategory("TEST");
		
		return new ResponseEntity<Term>(sample, HttpStatus.OK);
	}
	
	
}
