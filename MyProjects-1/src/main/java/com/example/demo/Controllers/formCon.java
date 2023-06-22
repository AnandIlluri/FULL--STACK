package com.example.demo.Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.form;
import com.example.demo.repositories.formRepo;
@RestController
@RequestMapping("con")
@CrossOrigin("http://localhost:3000")
public class formCon {
	@Autowired
	formRepo repo;
	@PostMapping("/booking")
	public String meth(@RequestBody form d)
	{
		repo.save(d);
		return "Booked";
	}
	@DeleteMapping("/delete/{id}")
	public String deletedata(@PathVariable int id) {
		repo.deleteById(id);
		return "Deleted";
	}
	@GetMapping("/getdata")
	List<form> getdata(){
		return repo.findAll();
		
	}
	@PutMapping("/update/{id}")
	public String updateForm(@PathVariable int id, @RequestBody form updatedForm) {
		form existingForm = repo.findById(id).orElse(null);
		if (existingForm != null) {
			existingForm.setName(updatedForm.getName());
			existingForm.setAge(updatedForm.getAge());
			existingForm.setPhonenumber(updatedForm.getPhonenumber());
			repo.save(existingForm);
			return "Updated";
		} else {
			return "Form not found";
		}
	}

}