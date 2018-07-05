package com.dthoperator.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RechargeDataValidator 
{
	//dthoperator data
	public boolean validatedthOperator(int dthOperator)
	{
		Pattern p = Pattern.compile("[0-9]{1}");
		String a=Integer.toString(dthOperator);
		Matcher m = p.matcher((a));
		return m.matches();
	}
	//validate consumer no
	public boolean validateConsumerNo(int consumerNo)
	{
		Pattern p =Pattern.compile("[0-9]+{10}");
		String a=Integer.toString(consumerNo);
		Matcher m = p.matcher((a));
		return m.matches();
	}
	//validate plan
	public boolean validatePlan(int plan)
	{
		Pattern  p= Pattern.compile("[0-9]{1}");
		String a=Integer.toString(plan);
		Matcher m = p.matcher((a));
		return m.matches();
	}
	//validate amount
	public boolean validateAmount(int amount)
	{
		Pattern p =Pattern.compile("[0-9]+{3,}");
		String a=Integer.toString(amount);
		Matcher m = p.matcher((a));
		return m.matches();
	}
}
