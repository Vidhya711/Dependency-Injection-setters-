package EmployeeDetails;

public class Address 
{
	private String city,state,country;
	public void setCity(String city)
	{
		this.city=city;
	}
	public void setState(String state)
	{
		this.state=state;
	}
	public void setCountry(String country)
	{
		this.country=country;
	}
	public String getCity()
	{
		return city;
	}
	public String getState()
	{
		return state;
	}
	public String getCountry()
	{
		return country;
	}
	
	public String toString()
	{
		return city+" "+state+" "+country;
	}
	
}