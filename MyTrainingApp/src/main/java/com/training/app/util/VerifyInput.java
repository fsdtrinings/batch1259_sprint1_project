package com.training.app.util;

public class VerifyInput {

	public static boolean verifyEmail(String email)
	{
		String arr[] = email.split("@");
		if(arr.length == 2) return true;
		else return false;
	}
}
