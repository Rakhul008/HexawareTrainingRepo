package com.userapp.main;

import com.userapp.service.IUserService;
import com.userapp.service.UserServiceImp;

public class Client {
	public static void main(String [] args) {
		UserServiceImp ser1=new UserServiceImp();
		ser1.validateUsername("Rakhul");
		ser1.checkPassword("Rakhul@1234");
	}
}
