package com.raghu.bean;

public class Person {
	private String name;
	private String phone;
	private String email;
	private String city;
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// required setters and getters
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", email=" + email + ", city=" + city + ", country="
				+ country + "]";
	}

}
