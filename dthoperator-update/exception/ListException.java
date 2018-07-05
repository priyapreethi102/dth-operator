package com.dthoperator.exception;

public class ListException extends Exception
{
	String message;
	public ListException()
	{
		this.message="Data not found.";
	}
	public String getMessage() 
	{
		return message;
	}
	public void setMessage(String message) 
	{
		this.message = message;
	}
	
}
