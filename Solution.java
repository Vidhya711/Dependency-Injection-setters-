package EmployeeDetails;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;  

public class Solution 
{

	public static void main(String[] args) 
	{
			Resource r = new ClassPathResource("applicationContext.xml");
			BeanFactory factory= new XmlBeanFactory(r);
			EmployeeData e=(EmployeeData)factory.getBean("add");
			e.display();
	}

}
