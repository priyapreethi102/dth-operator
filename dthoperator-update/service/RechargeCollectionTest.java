package com.dthoperator.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.dthoperator.bean.RechargeDetails;
import com.dthoperator.exception.ListException;



import com.dthoperator.bean.RechargeDetails;

public class RechargeCollectionTest 
{
	@Before
	public void setUp() throws Exception
	{
	}
	RechargeCollectionHelper r = new RechargeCollectionHelper();
	
	@After
	public void tearDown() throws Exception 
	{
	}
	
	@SuppressWarnings("deprecation")
	@Test(expected = ListException.class)
	public void testAddItems() throws ListException 
	{
		r.addRechargeDetails(new RechargeDetails("Airtel", 1234567890, "Monthly", 123, 3698));
		Assert.assertEquals(2, r.getItems().size());
	}
	
	@Test
	public void testToAddNewDetails() throws ListException
	{
		r.addRechargeDetails(new RechargeDetails("TATASky", 987456321, "Monthly", 5620, 1478));
		Assert.assertNotEquals(1, r.getItems().size());
	}
	
	@Test
	public void test()
	{
		r = null;
		Assert.assertNull(r);
		System.out.println(r);
	}
	@Test
	public void testcase()
	{
		RechargeCollectionHelper r = new RechargeCollectionHelper();
		RechargeCollectionHelper r1 = new RechargeCollectionHelper();
		Assert.assertNotEquals(1, 1);
	}

}
