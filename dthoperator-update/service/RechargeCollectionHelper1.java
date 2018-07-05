package com.dthoperator.service;

import com.dthoperator.bean.RechargeDetails;
import com.dthoperator.exception.ListException;

public interface RechargeCollectionHelper1 
{
	public void addRechargeDetails(RechargeDetails rechargeDetails) throws ListException;
	
	public void displayRechargeDetails(int transacctionID);
}
