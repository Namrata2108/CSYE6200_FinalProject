package edu.neu.cyse6200.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import edu.neu.cyse6200.objects.Immunization;
import edu.neu.cyse6200.objects.Student;
import edu.neu.cyse6200.services.ImmunizationService;

public class Temp {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://database-1.cog3jk7pua93.us-east-2.rds.amazonaws.com:3306/daycaredb", "admin",
					"Namrataisbad");
			ImmunizationService im = new ImmunizationService();
			Student student = new Student();
			student.setStudentID(102);
			Immunization imz = new Immunization();
			 Calendar calendarEnd=Calendar.getInstance();

			  // You can substract from the current Year to get the previous year last dates.
			  calendarEnd.set(Calendar.YEAR,calendarEnd.get(Calendar.YEAR)-1);

			imz.setDatesOfVaccination(calendarEnd);
			imz.setVaccineName("moderna");
			imz.setFrequency(2);
			student.setImmunizationList(new ArrayList<Immunization>());
			student.getImmunizationList().add(imz);
//			im.insertImmunizationRecord(student, con);
			System.out.println(im.getImmunizationAlerts(con));
		} catch ( ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
