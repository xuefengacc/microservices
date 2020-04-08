package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import Model.TermDTO;

@RestController
@RequestMapping("/")
public class HomeController {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private Environment env;
	
	@RequestMapping(value="/file{id}",method = RequestMethod.GET)
	public String getFilePath(@PathVariable final long id) {
		
		TermDTO term = new TermDTO();
		term = restTemplate.getForObject("http://dictionary/", TermDTO.class);
		
		return term.getFilePath();
	}
	
}
