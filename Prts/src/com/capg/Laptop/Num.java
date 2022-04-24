package com.capg.Laptop;

public class Num {
	import java.math.BigDecimal;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.List;
	import java.util.stream.Collectors;

	 

	enum Specialty {
	  //enum definition goes here..
	  ENGINEER, MANAGER, DEVOPS
	  
	}

	 

	class Specialist { 
	  //Code Here..
	  private String name;
	  private BigDecimal salary;
	  private Specialty specialty;
	  
	  public Specialist(String name, BigDecimal salary, Specialty specialty){
	      this.name=name;
	      this.salary=salary;
	      this.specialty=specialty;
	  }
	  
	  public void setName(String name){
	      this.name=name;
	  }
	  public void setSalary(BigDecimal salary){
	      this.salary=salary;
	  }
	  public void setSpecialty(Specialty specialty){
	      this.specialty=specialty;
	  }
	  
	  public String getName(){
	      return this.name;
	  }
	  public BigDecimal getSalary(){
	      return this.salary;
	  }
	  public Specialty getSpecialty(){
	      return this.specialty;
	  }
	  
	   @Override
	    public String toString() {
	        return "Specialist{" +
	                "name='" + name + '\'' +
	                ", salary=" + salary +
	                ", specialty=" + specialty +
	                '}';
	    }
	}
	class Implementation {
	  //Code Here..
	  
	  public List<Specialist> filterBySpecialty(List<Specialist> specialists, Specialty specialty){
	      
	      List<Specialist> response = new ArrayList<>();
	      
	      specialists.stream().forEach((i)->{
	          if(i.getSpecialty().name().equals(specialty.name())){
	              response.add(i);
	          }
	      });
	      
	      return response;
	  }
	  
	  public List<Specialist> sortSpecialistsByNameAsc(List<Specialist> specialists){
	      
	      specialists = specialists.stream().sorted((s1,s2)->
	        s1.getName().compareTo(s2.getName())
	      ).collect(Collectors.toList());
	      
	      return specialists;
	      
	  }
	  
	}

	 

	public class Source {
	    public static void main(String args[] ) throws Exception {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
	    }
	}

}
