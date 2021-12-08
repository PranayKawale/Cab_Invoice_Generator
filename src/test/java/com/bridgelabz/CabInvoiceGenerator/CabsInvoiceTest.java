package com.bridgelabz.CabInvoiceGenerator;

import org.junit.Assert;
import org.junit.Test;

public class CabsInvoiceTest {
	  CabInvoice cabInvoice=new CabInvoice();
	    @Test
	    public void ifExpectedTotalFareIsGreaterThanMinimumFare_shouldPass(){
	        double totalFare= cabInvoice.calculateFare(5.0, 2);
	        Assert.assertEquals(52.0,totalFare,0);
	    }
	    @Test
	    public void ifExpectedTotalFareIsLesserThanMinimumFare_shouldPass(){
	        double totalFare= cabInvoice.calculateFare(0, 2);
	        Assert.assertEquals(5,totalFare,0.0);
	    }
	    @Test
	    public void giveMultipleRide_shouldReturnTotalFare() {
	        Ride[] rides = {new Ride(2.0, 5),
	                new Ride(0.1, 1)
	        };
	        double fare=cabInvoice.calculateFare(rides);
	        Assert.assertEquals(30, fare, 0);
	    }
	}