package com.cg.frs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.mysql.cj.api.jdbc.Statement;

public class FlatRegistrationDAOImpl implements IFlatRegistrationDAO {

	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO FLAT) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			PreparedStatement preparedStatement= connection.prepareStatement("INSERT INTO FLAT_REGISTRATION(Owner_id,Flat_type,Flat_area,Rent_amount,Deposit_amount) VALUES(?,?,?,?,?)");
			
			preparedStatement.setInt(1, FLAT.getOwner_id());
			preparedStatement.setInt(2, FLAT.getFlat_type());
			preparedStatement.setInt(3, FLAT.getFlat_area());
			preparedStatement.setInt(4, FLAT.getRent_amount());
			preparedStatement.setInt(5, FLAT.getDeposit_amount());
			int i=preparedStatement.executeUpdate();
			if(i==1) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
				java.sql.Statement statement=connection.createStatement();
				
				ResultSet resultSet= statement.executeQuery("select * from FLAT_REGISTRATION");
				while(resultSet.next()) {
					if(resultSet.getInt(2)==FLAT.getOwner_id()) {
						FLAT.setFlat_id(resultSet.getInt(1));
					}
				
				}
			}
			else
				return null;
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		return FLAT;
	}

	public ArrayList<Integer> getAllOwnerIds() {
		ArrayList<Integer> a= new ArrayList<Integer>();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
	    java.sql.Statement statement=connection.createStatement();
	    ResultSet rs =statement.executeQuery("select *from flat_owners  ");
	    while(rs.next()) {
	    	rs.getInt(1);
	    	a.add(rs.getInt(1));
	    	
	    }
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		return a;
	}

}
