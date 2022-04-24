package com.capg.Customer;

import java.util.ArrayList;
import java.util.List;

public class Hotel{
	
		
		List<String> customerName=new ArrayList<String>();
		
		int roomsBooked=0;
		String check1="Checked in";
		String check2="No rooms available ";
		String check3="Yes";
		String check4="No";
		
		public String checkIn(Customer customer) {
			if(roomsBooked<10) {
				return check1;
			}
			else 
				return check2;
		}
		
		public String checkRooms(Customer customer) {
			if(roomsBooked<10) {
				return check3;
			}
			else
				return check4;
			}
	 	
	

		public static void main(String[] args) throws Exception {
			Customer cust=new Customer ("DoSelect",4);
			Hotel hotel=new Hotel();
			hotel.checkIn(cust);
		
		}

	}




