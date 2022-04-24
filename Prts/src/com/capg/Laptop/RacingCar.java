package com.capg.Laptop;

public class RacingCar {
	
		public int speed;
		public int distance;
		public int petrolRate;

		public RacingCar(int speed, int distance, int petrolRate) {
			this.speed = speed;
			this.distance = distance;
			this.petrolRate = petrolRate;
		}

		public int validateCar(int time) throws Exception {
			double celiSpeed = Math.ceil(distance/time);
			if (celiSpeed > time) {
				throw new LowSpeedException("Upgrade Car");
			} else if (celiSpeed < time) {
				throw new HighSpeedException("Accident Chances");
			}
			
			return calculateprice();
			
		}

		public int calculateprice() throws Exception {
			double petrolQuantity = Math.ceil(distance/petrolRate);
			return (int) petrolQuantity;
		}
		
		public static void main(String[] args) {
			RacingCar rc = new RacingCar(100, 1000, 11);
			try {
				System.out.println(rc.validateCar(50));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		} 
	}


