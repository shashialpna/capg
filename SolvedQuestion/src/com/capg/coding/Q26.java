package com.capg.coding;

public class Q26 {
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;



	class Member 
	{

		public List<String> match(List<String> memberNames) 
		{
			
			Collections.sort(memberNames);
			
			
			
			return memberNames;
		}

		public long countA(List<String> memberNames) 
		{
			
			long count=0;
			
			for(String x:memberNames)
				{
				char[] c=x.toCharArray();
			
					for(char d: c) 
					{
						if(d=='A') 
							{
							count++;
							}
		        
			
					}
			
				}
			return count;}
	}



	public class Count {
		public static void main(String[] args) {
			Member m=new Member();
			
			
			List<String> memberNames = new ArrayList<>(
					Arrays.asList("Amitabh", "Shekhar", "Aman", "Rahul", "Shahrukh", "Salman", "Yana", "Lokesh"));
			
			System.out.println(m.countA(memberNames));
			
			System.out.println("--------------------------------------------------------------------------");
			
			System.out.println(m.match(memberNames));
			
		}
	}

}
