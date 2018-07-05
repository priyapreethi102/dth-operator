package com.dthoperator.service;

import java.util.ArrayList;

import com.dthoperator.bean.RechargeDetails;
import com.dthoperator.exception.ListException;

public class RechargeCollectionHelper implements RechargeCollectionHelper1
{

	ArrayList<RechargeDetails> list;
	
	public  RechargeCollectionHelper() 
	{
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
		list.add(new RechargeDetails("Airtel", 1089343431, "Monthly", 210, 4567));
		list.add(new RechargeDetails("DishTV", 303322123, "Yearly", 1260, 2345));
		list.add(new RechargeDetails("Reliance", 892343430, "Quaterly", 650, 1234));
	}
	public ArrayList<RechargeDetails> getItems()
	{
		return list;
	}
	
	@Override
	public void addRechargeDetails(RechargeDetails rechargeDetails) throws ListException
	{
		// TODO Auto-generated method stub
		System.out.println("Details Adding...");
		if(list != null)
			list.add(rechargeDetails);
		throw new ListException();
	}

	@Override
	public void displayRechargeDetails(int transacctionID) 
	{
		// TODO Auto-generated method stub
		System.out.println("Generating Transaction ID..");
	}

}
