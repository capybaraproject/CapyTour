package com.projet.capy.capytour.feature.person;



import java.util.Scanner;


public class User extends Person  {

	private String pseudo;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(String pseudo, String name, String firstName, String mail, String phoneNumber) {
		super(name,firstName,mail,phoneNumber);
		this.pseudo = pseudo;
	}


	
	public User(String name, String firstName, String mail, String phoneNumber) {
		super(name, firstName, mail, phoneNumber);
		// TODO Auto-generated constructor stub
	}

	public User(String name, String firstName) {
		super(name, firstName);
		// TODO Auto-generated constructor stub
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	@Override
	public String toString() {
		
	return"User[pseudo="+pseudo+"name=" + name + ", firstName=" + firstName + ", mail=" + mail + ", phoneNumber=" + phoneNumber
		+ "]";
	}



	public void createNewUserObject(User user) {

		Scanner scan = new Scanner(System.in);
		//Todo change this part of code for the android app with editText view.
		System.out.println("Entrez nom");
		user.setName(scan.next());
		System.out.println("Entrez prenom");
		user.setFirstName(System.console().readLine());
		System.out.println("Entrez pseudo");
		user.setPseudo(System.console().readLine());
		System.out.println("Entrez adresse mail");
		user.setMail(System.console().readLine());
		System.out.println("Entrez votre numero de telephone:");
		user.setPhoneNumber(scan.next());
	}
}
