package com.projet.capy.capytour.feature.person;

import java.util.List;

public class TourCrew {
	
	
	private List<Contact>tourCrewList;

	
	public TourCrew() {
		super();
	}

	public TourCrew(List<Contact> localList) {
		super();
		this.tourCrewList = localList;
	}
	
	

	public List<Contact> getLocalList() {
		return tourCrewList;
	}

	
	public void setLocalList(List<Contact> localList) {
		this.tourCrewList = localList;
	}

	
	@Override
	public String toString() {
		return "TourCrew [localList=" + tourCrewList + "]";
	}
	
	

}
