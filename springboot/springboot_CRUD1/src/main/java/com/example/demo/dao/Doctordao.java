package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.Doctordto;
import com.example.demo.repository.DoctorRepository;

@Component
public class Doctordao {
	@Autowired
	DoctorRepository repository;

	public String insert(Doctordto dto) {
		repository.save(dto);
		return "data inserted";

	}

	public Doctordto fid(int id) {
		Optional<Doctordto> op = repository.findById(id);
		if(op.isPresent()) {
		return op.get();
		}else {
			return null;
		}

	}

	public List<Doctordto> fall() {
		 List<Doctordto> l=repository.findAll();
		 if(l.isEmpty()) {
			 return null;
		 }
		 else {
			 return l;
		 }
		
	}

	public String did(int id) {
		Optional<Doctordto> op = repository.findById(id);
		if (op.isPresent()) {
			repository.deleteById(id);
			return "data deleted successfully";
		} else {
			return "data not found";
		}

	}

	public String dall() {
		List<Doctordto> l=repository.findAll();
		if(l.isEmpty()) {
			return "data not found";
		}else {
		repository.deleteAll();
		return "data deleted successfully";
		}
	}

	public String update(Doctordto dto) {
		int id = dto.getId();
		Optional<Doctordto> op = repository.findById(id);
		if (op.isPresent()) {
			repository.save(dto);
			return "data updated";
		} else {
			return "data not found";
		}

	}

}