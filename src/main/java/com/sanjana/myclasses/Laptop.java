package com.sanjana.myclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Laptop {
	
	private int height;
	private int weight;
	private int length;
	private String brandName;
	@Autowired
	private IHarddisk hdd; //reference of Interface IHarddisk
	
	/*
	 * public Laptop() { //Constructor of Laptop class hdd = new SamsungHDD();
	 * //create object of Samsung cls }
	 */						//tight coupling
	@Override
	public String toString() {
		hdd.poweronHDD();
		hdd.powerreadHDD();
		return "Laptop [height=" + height + ", brandName=" + brandName + "]";
	}
	
//	public Laptop(int height, int weight, int length, String brandName) {
//		super();
//		this.height = height;
//		this.weight = weight;
//		this.length = length;
//		this.brandName = brandName;
//	}

	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
}
