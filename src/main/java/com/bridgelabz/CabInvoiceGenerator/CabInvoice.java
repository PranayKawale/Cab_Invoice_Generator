package com.bridgelabz.CabInvoiceGenerator;


public class CabInvoice 
{
	private static final int COST_PER_KM=10;
	private static final int COST_PER_MINUTE=1;
	private static final double MINIMUM_FARE=5.0;

	public double calculateFare(double distance, int time){
		double totalFare=((distance*COST_PER_KM)+(time*COST_PER_MINUTE));
		if (totalFare>MINIMUM_FARE)
			return totalFare;
		else {
			return MINIMUM_FARE;
		}
	}
	public static void main( String[] args )
	{
		System.out.println( "Welcome to the Cab Invoice Generator Problem" );
	}

    public double calculateFare(Ride[] rides) {
        double totalFare=0;
        for (Ride ride:rides){
            totalFare=totalFare+this.calculateFare(ride.distance,ride.time);
        }
        return totalFare;
    }
}
