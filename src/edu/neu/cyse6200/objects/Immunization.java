package edu.neu.cyse6200.objects;

import java.util.Calendar;
import java.util.Date;

public class Immunization {
	private String vaccineName;
	private Calendar dateOfVaccination;
	private int frequency;
	
	public String getVaccineName() {
		return vaccineName;
	}
	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}
	public Calendar getDatesOfVaccination() {
		return dateOfVaccination;
	}
	public void setDatesOfVaccination(Calendar dateOfVaccination) {
		this.dateOfVaccination = dateOfVaccination;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

}
