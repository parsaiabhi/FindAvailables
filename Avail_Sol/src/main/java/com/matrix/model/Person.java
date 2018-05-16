package com.matrix.model;


/**
 * @author abhishek
 *
 */

public class Person {

	private String name;
	private String address;
	private String zipCode;
	public String getName() {
		return name;
	}
	
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipCode() {
		return zipCode;
	}
	
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", zipCode=" + zipCode + "]";
	}
	
	

	
}
