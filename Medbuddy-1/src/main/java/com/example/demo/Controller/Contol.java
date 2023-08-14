package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.Repo;
import com.example.demo.Users.Product;


@RestController
public class Contol {
	@Autowired
	public Repo rep;
	
	@PostMapping ("/add")
	public Product adddata(@RequestBody Product user) {
		rep.save(user);
		return user;
	}
	@GetMapping ("/get")
	public List<Product> getAllUsers(){
		return rep.findAll();
}
	@GetMapping("/getbyid/{id}")
	public Optional<Product> getone (@PathVariable int id){
		return rep.findById(id);
}
	@PostMapping("/addproduct")
	public Product newcus (@RequestBody Product customer) {
		return rep.save(customer);
	}
	@PutMapping("/update")
	public Product update(@RequestBody Product product) {
		return rep.save(product);
	}
	@DeleteMapping ("/delete/{id}")
	public String delete(@PathVariable int id) {
		
		@SuppressWarnings("deprecation")
		Product cus=rep.getOne(id);
		rep.delete(cus);
		return "delete";
}
}