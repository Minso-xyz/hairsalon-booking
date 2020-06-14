package world.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookingController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@PostMapping("/submit")
	public String handleSubmitButton(@RequestParam("user_name") String username, @RequestParam("user_email") String useremail, @RequestParam("user_phone") String phone, @RequestParam("gender") String gender, @RequestParam("service") String service, Model model) {
		System.out.println(username);
		String sql = "INSERT INTO booking (name, email, phone, gender, service) VALUES ('" + username + "', '" + useremail + "', '" + phone + "', '" + gender + "', '" + service + "');";
		System.out.println(sql);
		model.addAttribute("name", username);
		jdbcTemplate.execute(sql);
		return "schedule";
	} 
	
	
	

}