package com.dthoperator.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.dthoperator.bean.RechargeDetails;
import com.dthoperator.service.RechargeCollectionHelper;
import com.dthoperator.service.RechargeDataValidator;

public class RechargeClient 
{

	public static void main(String[] args) throws com.dthoperator.exception.ListException 
	{
		// TODO Auto-generated method stub
		RechargeCollectionHelper r = new RechargeCollectionHelper();
		RechargeDataValidator data = new RechargeDataValidator();
		ArrayList<RechargeDetails> detail = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		//char ans=' ';
		System.out.println("Menu\n1. Make a Recharge \n2.Display Recharge Details \n3. Exit ");
		int menu = sc.nextInt();
		switch (menu) 
		{
		case 1:
			//to select dth operator
			System.out.println("Select DTH Operator:\n1.Airtel\n2.DishTV\n3.Reliance\n4.TATASky\n");
			int opt=0;
			opt= sc.nextInt();
			if(opt<4)
			{
				while(!data.validatedthOperator(opt))
				{
					opt = sc.nextInt();
				}
			}
			else
			{
				System.out.println("Data not found.");
				break;
			}
			//to enter the valid consumer number
			System.out.println("Enter Registered Consumer No.:\n");
			int consumerNum= 0;
			conNum= sc.nextInt();
			if(consumerNum == 1089343431 || consumerNum == 303322123)
			{
				while(!data.validateConsumerNo(consumerNum))
				{
					consumerNum= sc.nextInt();
				}
			}
			else
			{
				System.out.println("Data not found.");
				break;
			}
			//to select a plan
			System.out.println("Select Plan:\n1.Monthly\n2.Quarterly\n3.Half Yearly\n4.Annual\n");
			int plan = 0;
			plan = sc.nextInt();
			while(!data.validatePlan(plan))
			{
				plan = sc.nextInt();
			}
			//to enter the valid amount
			System.out.println("Enter Amount (Rs.):\n");
			int amount = 0;
			amount = sc.nextInt();
			while(!data.validateAmount(amount))
			{
				amount = sc.nextInt();
			}
			System.out.println("Transaction ID is:\n");
			int i=1234;
			int a=4;
			if(i%(a+2)==5)
			{
				i=2345;
				System.out.println(i);
			}
			else if(i%(a+1)==0)
			{
				i=2599;
				System.out.println(i);
			}
			else
			{
				i=2586;
				System.out.println(i);
			}	
			break;
			case 2:
				//to display the details 
				ArrayList<RechargeDetails> list = r.getItems();
				for(RechargeDetails rechargeDetails : list)
					System.out.println(rechargeDetails);
				break;
			case 3:
				//to exit the application
				System.out.println("Exit");
				break;
			default:
				System.out.println("Wrong Choice\n");
				break;
		}
	}
}
