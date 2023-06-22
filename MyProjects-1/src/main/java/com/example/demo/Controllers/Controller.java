package com.example.demo.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.model1;
import com.example.demo.repositories.Repo1;
@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/connect")
public class Controller {
	@Autowired
	 Repo1 r;
	@PostMapping("/signupdata")
	public String mthd(@RequestBody model1 d)
	{
	 String user=d.getEmail();
	 model1 m4=r.findByEmail(user);
		if(m4==null)
		{
			r.save(d);
			return "added";
		}
		else
		{
			return "user alredy exist";
		}
	}
	// Login
	@PostMapping("/logindata/{email}/{password}")
	public String login(@PathVariable String email,@PathVariable String password)
	{
		model1 m3=r.findByEmail(email);
		if(m3 == null)
		{
			return "Invalid Email";
		}
		else
		{
			if(m3.getPassword().equals(password))
			{
				return "Success";
			}
			else {
				return "Invalid Password";
		}
	}
	}
}