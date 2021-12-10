package edu.neu.cyse6200.objects;

import java.sql.Date;
import java.util.List;

public class Immunization {
	private String vaccineName;
	private List<Date> datesOfVaccination;
	private int frequency;
	
	public String getVaccineName() {
		return vaccineName;
	}
	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}
	public List<Date> getDatesOfVaccination() {
		return datesOfVaccination;
	}
	public void setDatesOfVaccination(List<Date> datesOfVaccination) {
		this.datesOfVaccination = datesOfVaccination;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

}
