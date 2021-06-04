import java.util.*;
public class Company {
	private String name;
	private String employees;
	private String teamlead;
	public String getname() 
	{
		return name;
	}
	public void setname(String n)
	{
		this.name=n;
	}
	public String getemployees() 
	{
		return employees;
	}
	public void setemployees(String emp)
	{
		this.employees=emp;
	}
	public String getteamlead() 
	{
		return teamlead;
	}
	public void setteamlead(String tm)
	{
		this.teamlead=tm;
	}
	public void show()
	{
		if(employees.contains(teamlead))
		{
			System.out.println("Name: "+name);
			System.out.println("Employees: "+employees);
			System.out.println("Lead: "+teamlead);
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
class Companymain{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String name,employees,teamlead;
		System.out.println("Enter the company name:");
		name=sc.nextLine();
		System.out.println("Enter the employees:");
		employees=sc.next();
		System.out.println("Enter teamlead:");
		teamlead=sc.next();
		//String[] values = employees.split(","); 
		Company obj=new Company();
		obj.setname(name);
		obj.setemployees(employees);
		obj.setteamlead(teamlead);
		obj.show();		
		
	}
}