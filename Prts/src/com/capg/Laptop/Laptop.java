package com.capg.Laptop;

public class Laptop {
	
		int price;
		String details;

		public Laptop(String details, int price) {
			this.details = details;
			this.price = price;
		}
	}
	 class Afford {
		 
		public String checkConfiguration(Laptop laptop) throws Exception {
			if (laptop.price > 70000) {
				throw new LaptopException("Price too high");
			}

			String details = laptop.details;
			String[] detailsArr = details.split("/");

			int ram = Integer.parseInt(detailsArr[0]);

			if (ram < 8) {
				throw new LaptopException("Minimum 8 Ram is required");
			}

			int hdStorage = Integer.parseInt(detailsArr[1]);

			if (hdStorage < 258) {
				throw new LaptopException("Minimum 256 space required");
			}

			if ("HDD".equals(detailsArr[2])) {
				throw new LaptopException("SDD required");
			}

			return "Laptop can be purchased";
		}

		public String purchaseLaptop(Laptop laptop) throws Exception {
			try {
				checkConfiguration(laptop);
			} catch (LaptopException e) {
				return "Change configuration";
			} catch (Exception e) {
				return "other exception";
			}
			return "Perfect configuration";
		}
	}
	 public static void main(String[] args) throws Exception {
			Laptop laptop = new Laptop("8/512/SSD", 58000);
			Afford af = new Afford();
			System.out.println(af.checkConfiguration(laptop).toLowerCase());
			System.out.println(af.purchaseLaptop(laptop).toLowerCase());

		}

}
