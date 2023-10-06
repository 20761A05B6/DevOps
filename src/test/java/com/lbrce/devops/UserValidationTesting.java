package com.lbrce.devops;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidationTesting {
	@Test
	public void testCase1()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(true,uv.check("srinu", "srinu@123"));
	}
	@Test
	public void testCase2()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(true,uv.check("SRINU", "srinu@123"));
	}
	@Test
	public void testCase3()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(true,uv.check("srinu", "SRINU@123"));
	}
	@Test
	public void testCase4()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(true,uv.check("Srinu", "Srinu@123"));
	}

}
