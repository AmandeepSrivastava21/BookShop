package com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jdbc.CP;
import com.to.UserTO;

public class UserRepo {
	Connection connection  = CP.createConnection();
public void register(UserTO user) {
	   
		
		try {
			
			PreparedStatement statement = connection.prepareStatement("insert into user values(?, ?, ?)");

			statement.setInt(1, user.getId());
			statement.setString(2, user.getName());
			statement.setString(3, user.getEmail());

			statement.executeUpdate();
		}
		catch (Exception e) {
			System.out.println("inside regsiter of UserRepository");
		}

		
	}
	
	
	public int login(int id) {
		
		try {
			
			PreparedStatement statement = connection.prepareStatement("select * from user where id = ?");

			statement.setInt(1, id);
			
			ResultSet resultset =  statement.executeQuery();
			
			if(resultset.next() == true) {
				return 1;
			}
			
		}
		catch(Exception e) {
			
			System.out.println("inside catch of Login of UserRepo");
		}
		
		return 0;
	}
	
    public int AdminLogin(int id) {
    	int admin_id=123;
		if(admin_id==id) {
		try {
			
			PreparedStatement statement = connection.prepareStatement("select * from user where id = ?");

			statement.setInt(1, id);
			
			ResultSet resultset =  statement.executeQuery();
			
			if(resultset.next() == true) {
				return 1;
			}
			
		}
		catch(Exception e) {
			
			System.out.println("inside catch of Login of UserRepo");
		}}
		
		return 0;
	}  

}
