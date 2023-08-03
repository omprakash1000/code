package com.cap.controller;

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


import com.cap.model.Supplier;
import com.cap.service.SupplierAlreadyExistException;
import com.cap.service.SupplierService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/supplier")
public class SupplierController {

	@Autowired
	SupplierService supplierService;
	
	@GetMapping("/")
	String send() {
		return "Server is running";
	}
	@PostMapping("/addSupplier")
	public Supplier addSupplier(@RequestBody Supplier supplier) throws SupplierAlreadyExistException {
		return supplierService.addSupplier(supplier);
	}
	@GetMapping("/findSupplier/{id}")
	Supplier findSupplier(@PathVariable int id ) {
		return supplierService.findSupplier(id);
	}	
		@GetMapping("/findAllSupplier")
		List<Supplier>getAll(){
			return supplierService.getAll();
		}
		@DeleteMapping("/delete/{id}")
		String deleteById(@PathVariable int id) {
			return supplierService.deleteById(id);
		}
		

		@PutMapping("/update/{id}")
		public  Supplier updateSupplierById(@PathVariable int id,@RequestBody Supplier supplier ) {
			
			return supplierService.updateSupplierById(id,supplier);
			}
		}
	