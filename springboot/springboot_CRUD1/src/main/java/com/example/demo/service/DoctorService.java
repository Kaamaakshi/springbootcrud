package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Doctordao;
import com.example.demo.dto.Doctordto;

@Service
public class DoctorService {

	@Autowired
	Doctordao dao;

	public String insert(Doctordto dto) {
		return dao.insert(dto);

	}
	
	public Doctordto fid(int id) {
		return dao.fid(id);
	}
	
	public List<Doctordto> fall() {
		return dao.fall();
	}
	public String did(int id) {
		return dao.did(id);
	}
	public String dall() {
		return dao.dall();
	}
	public String update(Doctordto dto) {
		return dao.update(dto);
	}

}
