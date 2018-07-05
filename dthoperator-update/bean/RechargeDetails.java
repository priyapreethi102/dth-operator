package com.dthoperator.bean;

public class RechargeDetails 
{
	String dthOperator;
	int consumerNo;
	String rechargePlan;
	int amount;
	int transactionID;
		
	public RechargeDetails(String dthOperator, int consumerNo, String rechargePlan, int amount, int transactionID) 
	{
		super();
		this.dthOperator = dthOperator;
		this.consumerNo = consumerNo;
		this.rechargePlan = rechargePlan;
		this.amount = amount;
		this.transactionID = transactionID;
	}

	public String getDthOperator() 
	{
		return dthOperator;
	}

	public void setDthOperator(String dthOperator) 
	{
		this.dthOperator = dthOperator;
	}

	public int getConsumerNo() 
	{
		return consumerNo;
	}

	public void setConsumerNo(int consumerNo) 
	{
		this.consumerNo = consumerNo;
	}

	public String getRechargePlan() 
	{
		return rechargePlan;
	}

	public void setRechargePlan(String rechargePlan) 
	{
		this.rechargePlan = rechargePlan;
	}

	public int getAmount() 
	{
		return amount;
	}

	public void setAmount(int amount) 
	{
		this.amount = amount;
	}

	public int getTransactionID() 
	{	
		return transactionID;
	}

	public void setTransactionID(int transactionID)
	{
		this.transactionID = transactionID;
	}

	@Override
	public String toString() 
	{
		return "RechargeDetails [dthOperator=" + dthOperator + ", consumerNo=" + consumerNo + ", rechargePlan="
				+ rechargePlan + ", amount=" + amount + ", transactionID=" + transactionID + "]";
	}
}
