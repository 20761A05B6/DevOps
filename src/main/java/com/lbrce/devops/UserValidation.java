package com.lbrce.devops;
import java.util.ResourceBundle;
public class UserValidation {
	public boolean check(String uidIn,String pswIn)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String uid=rb.getString("username");
		String psw=rb.getString("password");
		if(uidIn.equals(uid)&&pswIn.equals(psw))
		return true;
		else
		return false;
	}

}
