package com.userapp.service;

public interface IUserService {

	void validateUsername(String username)throws WrongUserNameException;
	void checkPassword(String password)throws TooShortException,TooLongException;
	
}
