package com.sb.doctorconsultant.dto;

public class Patient {
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + ", details="
				+ details + "]";
	}
	int id;
	String name;
	String address;
	String contact;
	String details;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
}
