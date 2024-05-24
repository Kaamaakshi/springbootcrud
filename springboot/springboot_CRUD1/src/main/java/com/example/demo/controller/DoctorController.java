package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Doctordto;
import com.example.demo.service.DoctorService;

@RestController
@RequestMapping("/Doctors")

public class DoctorController {

	@Autowired
	DoctorService doctorService;
		
	@PostMapping
	public String insert(@RequestBody Doctordto dto) {
		return doctorService.insert(dto);

	}

	@GetMapping("/{id}")
	public Doctordto fetchById(@PathVariable int id) {
		return doctorService.fid(id);

	}

	@GetMapping
	public List<Doctordto> fetchAll() {
		return doctorService.fall();
	}

	@DeleteMapping("/{id}")
	public String delete(@RequestParam int id) {
		return doctorService.did(id);

	}
	@DeleteMapping
	public String deleteAll() {
		return doctorService.dall();
	}

	@PutMapping

	public String update(@RequestBody Doctordto dto) {
          return doctorService.update(dto);
          
	}

}
