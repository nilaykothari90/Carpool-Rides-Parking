package com.edu.parking;

public class GarageParking extends Parking {

	public GarageParking(ParkingType pt) {
		super(pt);
	}

	@Override
	public void parkVehicle() {
		System.out.println("You garage parking space is successfully booked");
	}

	public void showParkingDetails(String location, String garageName, String date, float fromTime, float toTime,
			float cost) throws Exception {
		super.showParkingDetails(location, garageName, date, fromTime, toTime, cost);
	}
}
