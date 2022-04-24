package com.capg.Laptop;

public class Material {
	int mass;
	int temperature;
	public Material(int mass, int temperature) {
		this.mass = mass;
		this.temperature = temperature;
	}
	
	public String flowOfHeat() throws Exception{
		try {
			checkMaterial();
			return "Both in equilibrium";
		} catch(MaterialException ex) {
			return "Invalid Material";
		} catch(Exception ex) {
			return "Other exception";			
		}
	}
	public String checkMaterial() throws Exception{
		if(mass<0) {
			throw new MaterialException("Mass cannot be negative");
		} else if(mass==0) {
			throw new MaterialException("Mass cannot be zero");
		} else {
			return "Valid material";
		}
	}
}
public class MaterialException extends Exception {
	
	public MaterialException(String msg){
		super(msg);
	}
	
	public static void main(String[] args) throws Exception {
		Material m=new Material(12,32);
		String s=m.flowOfHeat();
		System.out.println(s);
	}
}

}
