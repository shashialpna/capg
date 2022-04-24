package com.capg.Customer;

public class Source {

	public static void main(String[] args) throws Exception {
		Customer cust=new Customer ("DoSelect",4);
		Hotel hotel=new Hotel();
		hotel.checkIn(cust);
	
	}

}
