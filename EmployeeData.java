package EmployeeDetails;

public class EmployeeData
{
	private String name;
	private int eid;
	private Address address;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setId(int eid)
	{
		this.eid=eid;
	}
	public void setAddress(Address address)
	{
		this.address=address;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return eid;
	}
	public Object getAddress()
	{
		return address;
	}
	public void display()
	{
		System.out.println(name+" "+eid);
		System.out.println(address);
	}
}