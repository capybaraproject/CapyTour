package com.projet.capy.capytour.feature.place;

import com.projet.capy.capytour.feature.person.LocalCrew;


import java.util.Scanner;

public class Venue extends Place{

	private LocalCrew localCrew;
	
	public Venue(String name, String address, LocalCrew localCrew) {
		super();
		this.name = name;
		this.address = address;
		this.localCrew = localCrew;
	}


	public Venue(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	
	public Venue() {
		super();
	}



 public void createNewUserObject(Venue venue){
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Entrez nom de la Salle");
	 venue.setName(scan.next());
	 System.out.println("Entrez adresse:");
	 venue.setAddress(scan.next());
 }
	
	@Override
	public String toString() {
		return "Venue [name=" + name + ", address=" + address + ", localCrew=" + localCrew + "]";
	}

    public LocalCrew getLocalCrew() {
        return localCrew;
    }

    public void setLocalCrew(LocalCrew localCrew) {
        this.localCrew = localCrew;
    }
}
