package com.example.demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.model1;
public interface Repo1 extends JpaRepository<model1,Integer> {


	model1 findByEmail(String user);
	

}