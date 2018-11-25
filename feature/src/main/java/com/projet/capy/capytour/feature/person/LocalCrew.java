package com.projet.capy.capytour.feature.person;


import com.projet.capy.capytour.feature.person.Contact;

import java.util.List;

public class LocalCrew  {

	private List<Contact>localList;

	public LocalCrew(List<Contact> localList) {
		super();
		this.setLocalList(localList);
	}

	public LocalCrew() {
		super();
	}

	public List<Contact> getLocalList() {
		return localList;
	}

	public void setLocalList(List<Contact> localList) {
		this.localList = localList;
	}
	
	
	
}
