package com.example.demo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
public class Inmakes implements Serializable{

	private int intern_id;
	private String intern_name;
	private double intern_duration;
    @Autowired
    @Qualifier("dillu")
    private Placement plce;
	
	public Inmakes()
	{
		System.out.println("Inmakes Object created");
	}

	public int getIntern_id() {
		return intern_id;
	}

	public void setIntern_id(int intern_id) {
		this.intern_id = intern_id;
	}

	public String getIntern_name() {
		return intern_name;
	}

	public void setIntern_name(String intern_name) {
		this.intern_name = intern_name;
	}

	public double getIntern_duration() {
		return intern_duration;
	}

	public void setIntern_duration(double intern_duration) {
		this.intern_duration = intern_duration;
	}
	public void show()
	{
		System.out.println("Show method calling");
	    plce.getPlacement();
	
	}
}
