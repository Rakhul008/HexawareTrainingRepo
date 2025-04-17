package com.userapp.service;

public class UserServiceImp implements IUserService {


	
	public void validateUsername(String username) {
		if(username.equals("Rakhul")) {
			System.out.println("Welcome"+username);
		throw new WrongUserNameException("WrongUserName");} 
		else
		System.out.println("Nothing");
		
	}

	public void checkPassword(String password) {
		if(password.length()<5) {
			System.out.println("Too Short");
		throw new TooShortException("Tooo short Password");
		}else if(password.length()>15) {
			System.out.println("Too Long");
		throw new TooLongException("Tooo Long Password");
		}else {
			System.out.println("Perfect Password");
		}
		
	}
}