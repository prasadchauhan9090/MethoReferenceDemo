package com.spring.actuator.methodReference;

public class MyDataFormatter {
	
	
	public String removeSplChars(String s)
	{
		return s.replaceAll("[^a-zA-Z0-9]", "");
	}

}
