package com.projet.capy.capytour.feature.place;

import java.util.Scanner;

public class Accommodation extends Place {

	private int numberOfRooms;

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	 private String phoneNumber;

	public Accommodation(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public void createNewUserObject(Accommodation hotel){
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrez nom de la Salle");
		hotel.setName(scan.next());
		System.out.println("Entrez adresse:");
		hotel.setAddress(scan.next());
	}


	@Override
	public String toString() {
		return "Accommodation{" +
				"numberOfRooms=" + numberOfRooms +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
