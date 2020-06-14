package world.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import world.model.Person;

@RestController
public class BookingRestController {

	//@Autowired
	CoolPeople people;
	
	@GetMapping("/person")
	public Person personWebService() {
		Person p = new Person("Mikso", "mikso@banana.com", "3984918310");
		return p;
	}
	
	@GetMapping("/hi")
	public void hi() {
		people.sayHi();
	}
	
}