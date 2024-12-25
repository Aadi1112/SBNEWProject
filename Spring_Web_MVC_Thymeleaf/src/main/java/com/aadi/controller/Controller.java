package com.aadi.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aadi.entity.Product;
import com.aadi.repo.ProductRepository;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	ProductRepository repository;
	
	@GetMapping("/edit")
	public String edit(@RequestParam("id") Integer id,Model model) {
		
		
		Optional<Product> op= repository.findById(id);
		if(op.isPresent()) {
			Product product= op.get();
			model.addAttribute("product", product);
		}
		 
		return "welcome";
		
	}
	
	
	
	
	
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") Integer id,Model model) {
		
		
		repository.deleteById(id);
		model.addAttribute("msg", "Product Delete");
		model.addAttribute("products", repository.findAll());
		
		return "data";
	}
	

	@GetMapping("/products")
	public String getProducts(Model model) {

		model.addAttribute("products", repository.findAll());

		return "data";

	}

	@GetMapping("/")
	public String loadProductForm(Model model) {

		Product product = new Product();

		model.addAttribute("product", product);

		return "welcome";
	}

	@PostMapping("/save")
	public String saveProduct(@Validated  @ModelAttribute("product") Product product,BindingResult result, Model model) {

		
		if(result.hasErrors())
		{
			return "welcome";
		}
		
		
		product = repository.save(product);
		if (product.getId() != null) {
			model.addAttribute("msg", "Product Saved");
		}

		return "welcome";

	}
}
