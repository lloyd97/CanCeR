package com.cancer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "role")
	private String role;
	
	@Column(name = "food")
	private String food;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "is_active")
	private String isActive;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "recover_code")
	private String recoverCode;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "photo")
	private String photo;
	
		
	public User(String name, String surname, String email, String password, String role, String address, String dob,
			String isActive, String phone, String recoverCode, String location, String photo) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.role = role;
		this.address = address;
		this.dob = dob;
		this.isActive = isActive;
		this.phone = phone;
		this.recoverCode = recoverCode;
		this.location = location;
		this.photo = photo;
	}

	public User() {
		super();
	}
	
	public User(String name, String surname, String email, String password, String role, String food, String address,
			String dob, String isActive, String phone, String recoverCode, String location, String photo) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.role = role;
		this.food = food;
		this.address = address;
		this.dob = dob;
		this.isActive = isActive;
		this.phone = phone;
		this.recoverCode = recoverCode;
		this.location = location;
		this.photo = photo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRecoverCode() {
		return recoverCode;
	}
	public void setRecoverCode(String recoverCode) {
		this.recoverCode = recoverCode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	
	
}
