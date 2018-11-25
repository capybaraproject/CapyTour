package com.projet.capy.capytour.feature.place;

import java.util.Scanner;

public class Accommodation extends Place {

	int numberOfRooms;

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
