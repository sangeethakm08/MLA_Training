package com.test;

import jakarta.persistence.*;

@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "collage")
public class Collage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private String c_name;
	public Collage() {
	}
	public Collage(int id, String c_name) {
		this.id = id;
		this.c_name = c_name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	

	@Override
	public String toString() {
		return "Collage [id=" + id + ", c_name=" + c_name + "]";
	}
	
	
}
