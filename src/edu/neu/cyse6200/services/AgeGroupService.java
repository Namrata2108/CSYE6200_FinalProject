package edu.neu.cyse6200.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AgeGroupService {

	public int getAgeGroup(Connection con, int groupNo) {
		try {
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(String
					.format("Select * from grps where ageGroup =%s and remainingcapacity>0", String.valueOf(groupNo)));
			if (rs.next())
				return rs.getInt(1);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return -1;
	}

	public int insertAgeGroup(Connection con, int groupNo) {
		try {
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(String.format(
					"insert into grps(ageGroup, classroomId, maxcapacity,remainingcapacity) values(%s,%s,%s,%s);",
					String.valueOf(groupNo)));
			if (rs.next())
				return rs.getInt(1);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return -1;
	}
	
	public int decrementCapacity(Connection con, int groupNo) {
		try {
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(String.format("UPDATE grps SET remainingcapacity = remainingcapacity - 1 WHERE id = %s",
					String.valueOf(groupNo)));
			if (rs.next())
				return rs.getInt(1);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return -1;
	}

}
