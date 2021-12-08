package com.bridgelabz.CabInvoiceGenerator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabsInvoiceTest {
	 CabInvoice cabInvoice = new CabInvoice();

	    @Before
	    public void setUp() throws Exception {

	    }

	    @Test
	    public void ifExpectedTotalFareIsGreaterThanMinimumFare_shouldPass() {
	        double totalFare = cabInvoice.calculateFare(5.0, 2);
	        Assert.assertEquals(52.0, totalFare, 0);
	    }

	    @Test
	    public void ifExpectedTotalFareIsLesserThanMinimumFare_shouldPass() {
	        double totalFare = cabInvoice.calculateFare(0, 2);
	        Assert.assertEquals(5, totalFare, 0.0);
	    }
	    @Test
	    public void giveMultipleRide_shouldReturnTotalFare() {
	        Ride[] rides = {new Ride(2.0, 5),
	                new Ride(0.1, 1)
	        };
	        double fare = cabInvoice.calculateTotalFare(rides);
	        Assert.assertEquals(30, fare, 0);
	    }


	    @Test
	    public void giveMultipleRide_shouldReturnInvoiceSummary() {
	        Ride[] rides = {new Ride(2.0, 5),
	                new Ride(0.1, 1)
	        };
	        InvoiceSummary summary = cabInvoice.calculateFare(rides);
	        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30);
	        Assert.assertEquals(expectedInvoiceSummary, summary);
	    }
	}