package com.projet.capy.capytour.feature.person;

public abstract class Person  {//superClass for all the protagonists(users and contacts).
	

	protected String name;
	protected String firstName;
	protected String mail;
	protected String phoneNumber;

	public Person() {
		
	}
	public Person(String name, String firstName, String mail, String phoneNumber) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.mail = mail;
		this.phoneNumber = phoneNumber;
	}
	public Person(String name, String firstName) {
		super();
		this.name = name;
		this.firstName = firstName;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", firstName=" + firstName + ", mail=" + mail + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



}
