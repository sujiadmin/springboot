package com.riblabs.springbootdemo.company;

public class Company {
	
	private String name;
	private String location;
	private String website;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}
	
	public Company(String name, String location, String website) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.location = location;
		this.website = website;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", website=" + website + "]";
	}
	
}
