package com.capg.Customer;

import javax.xml.validation.Validator;
public class Email {
	
	
	private static final String Email = null;
	public String  username;
	public String domain;
	private String domainConatin;
	private Object usernameContain;
	private Email v;
	public Email(String username, String domain) {
		this. username= username;
		this.domain=domain;
	}


	public String checkEmail() throws Exception{
	 if(this.usernameContain("@","#","$","%") )
		 return "Invalid Exception";
	 else 
		 if(this.domainConatin !="outlook"+"gmail"+"hotmail"+"godaddy")
			 return "Invalid domain";
			 else
				 return "Continue";
			 
	}
	public String getUsername() {
	return username;
	}


	public void setUsername(String username) {
	this.username = username;
	}


	public String getDomain() {
	return domain;
	}


	public void setDomain(String domain) {
	this.domain = domain;
	}


	public String getDomainConatin() {
	return domainConatin;
	}


	public void setDomainConatin(String domainConatin) {
	this.domainConatin = domainConatin;
	}



	private boolean usernameContain(String string, String string2, String string3, String string4) {
	// TODO Auto-generated method stub
	return false;
	}


	public String signIn(Email email) throws Exception{
	 try {
		 this.checkEmail();
		 return "Signed in";
	 }
	 catch(checkEmailException e) {
		 return "Failed";
	 }
	}
	@SuppressWarnings("deprecation")
	public  void EmailException(String msg) throws Exception {
	 Email e=new Email("Shoyab@","gmail");

	 String t = ((Email) v).signIn(e);
	 String s = ((Email) v).signIn(e);
	 s.toLowerCase();
	  t.toLowerCase();

	}



	}

}
