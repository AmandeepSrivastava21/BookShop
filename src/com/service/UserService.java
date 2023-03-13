package com.service;

import java.util.Scanner;

import com.repository.UserRepo;
import com.to.UserTO;

public class UserService {
	UserRepo repository = new UserRepo();

	Scanner sc = new Scanner(System.in);


	public void register() {

		System.out.println("Enter your Id!!");
		int id = sc.nextInt();

		System.out.println("Enter your Name");
		String name = sc.next();

		System.out.println("Enter your Email");
		String email = sc.next();
		
		UserTO user = new UserTO(id, name, email);

		repository.register(user);
	}

	public int login() {

		System.out.println("Enter your id");
		int id = sc.nextInt();

		return repository.login(id);
	}
	public int AdminLogin() {
		System.out.println("enter admin id");
		int id=sc.nextInt();
		return repository.AdminLogin(id);
	}
}
