package com.aadi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aadi.entity.ProductEntity;
import com.aadi.repo.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	ProductRepository repository;
	
	
	
	   @GetMapping("/products")
	   public String getAllProducts(Model model) {
		   
		   model.addAttribute("products", repository.findAll());
		   
		   return "data";
		   
	   }
	
	  @GetMapping("/")
	   public String loadProductForm(Model model) {
		   
		   ProductEntity p=new ProductEntity();
		   model.addAttribute("product", p);
		   return "index";
	   }
	  
	  @PostMapping("/product")
	  public String save(@ModelAttribute("product") ProductEntity entity,Model model) {
		  
		 entity=repository.save(entity);
		 if(entity!=null) {
			 
			 model.addAttribute("msg", "Product Saved");
			 
		 }
		 
		 return "index";
		  
	  }
}
