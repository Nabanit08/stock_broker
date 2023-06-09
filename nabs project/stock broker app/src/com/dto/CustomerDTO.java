package com.dto;

public interface CustomerDTO {

	public String getFirstName();
	public void setFirstName(String firstName);

	public String getLastName();
	public void setLastName(String lastName);

	public String getUserName();
	public void setUserName(String userName);

	public String getPassword();
	public void setPassword(String password);

	public String getAddress();
	public void setAddress(String address);

	public String getMobile();
	public void setMobile(String mobile); 

	public String getEmail(); 
	public void setEmail(String email);


	void setCustomerId(int customerId);
	int getCustomerId();	
}
