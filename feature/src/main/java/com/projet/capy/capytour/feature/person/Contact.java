package com.projet.capy.capytour.feature.person;


import com.projet.capy.capytour.feature.place.Venue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Contact extends Person  {

	private String function; // light ingeneer, Stage manager....
	private Venue venue;

	public Contact() {
	}


	public Contact(String name, String firstName, String mail, String phoneNumber, String function, Venue venue) {
		super(name, firstName, mail, phoneNumber);
		this.function = function;
		this.venue = venue;
	}

	public Contact(String name, String firstName, String function, Venue venue) {
		super(name, firstName);
		this.function = function;
		this.venue = venue;
	}


	public List<Contact> doContactList(Contact... contacts) {

		List<Contact> contactList = new ArrayList<>();
		for (Contact contact : contactList) {

			contactList.add(contact);
		}

		return contactList;
	}


	@Override
	public String toString() {
		return "Contact [function=" + function + ", venue=" + venue + ", name=" + name + ", firstName=" + firstName
				+ ", mail=" + mail + ", phoneNumber=" + phoneNumber + "]";
	}


	public void createNewUserObject(Contact contact) {

		Scanner scan = new Scanner(System.in);
		//Todo change this part of code for the android app with editText view.
		System.out.println("Entrez nom");
		contact.setName(scan.next());
		System.out.println("Entrez prenom");
		contact.setFirstName(scan.next());
		System.out.println("Entrez sa fonction");
		contact.setFunction(scan.next());
		System.out.println("Entrez adresse mail");
		contact.setMail(scan.next());


	}


	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public Contact(String function, Venue venue) {

		super();
		this.function = function;
		this.venue = venue;
	}
}