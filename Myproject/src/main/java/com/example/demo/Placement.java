package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dillu")

public class Placement  {
	
	private int pid;
	private int company;
	private int place;



	
	
	public int getPid() {
		return pid;
		
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getCompany() {
		return company;
	}
	public void setCompany(int company) {
		this.company = company;
	}
	public int getPlace() {
		return place;
	}
	public void setPlace(int place) {
		this.place = place;
	}
	public void getPlacement()
	{
		System.out.println("student Placed");
	    
	}

}
