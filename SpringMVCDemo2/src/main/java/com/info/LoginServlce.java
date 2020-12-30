package com.info;

public class LoginServlce {
	
	public String validate(String name,String pass)
	{
		String msg=" ";
		if(name.equals("admin")&& pass.equals("Password123"))
		{
			msg ="valid";
			
		}
		else {
			msg ="invalid";
		}
		return msg;
	}

}
