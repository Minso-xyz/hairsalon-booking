package world.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ScheduleController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@PostMapping("/date")
	public String handleSubmitButton(@RequestParam("datepicker") String datepicker) {
		String sql = "INSERT INTO booking (date) VALUES ('" + datepicker + "');";
		System.out.println(sql);
		jdbcTemplate.execute(sql);
		return "Time";
	} 
	
	
	

}