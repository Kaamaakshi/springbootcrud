package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctordto {
	@Id
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Doctordto [id=" + id + ", name=" + name + "]";
	}

}
