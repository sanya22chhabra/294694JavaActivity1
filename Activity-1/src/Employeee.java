import java.util.*;
public class Employeee {
	Scanner sc=new Scanner(System.in);
	private String name;
	private String address;
	private String mobile;
	public String getname() 
	{
		return name;
	}
	public void setname(String n)
	{
		this.name=n;
	}
	public String getaddress() 
	{
		return address;
	}
	public void setaddress(String ad)
	{
		this.address=ad;
	}
	public String getmobile() 
	{
		return mobile;
	}
	public void setmobile(String mb)
	{
		this.mobile=mb;
	}
	public void show() {
		System.out.println("Employee Details");
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Mobile: "+mobile);
	}
	public void update()
	{
		int ch;
		String newname,newadd,newmb;
		do{
		System.out.println("Menu");
		System.out.println("1.Update Employee name");
		System.out.println("2.Update Employee Address");
		System.out.println("3.Update Employee mobile");
		System.out.println("4.All information correct/Exit");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1: {
				System.out.print("Current name is: "+name);
				System.out.print("\nEnter the name:");
				newname=sc.next();
				this.name=newname;
				break;
			}
			case 2:{
				System.out.print("Current address is: "+address);
				System.out.print("\nEnter the address:");
				newadd=sc.next();
				this.address=newadd;
				break;
			}
			case 3:
			{
				System.out.print("Current mobile is: "+mobile);
				System.out.print("\nEnter the mobile:");
				newmb=sc.next();
				this.mobile=newmb;
				break;
			}
			case 4:{
				break;
			}
		}
		}
		while(ch!=4);
		show();
}
}
class Employeeemain{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		String name,mobile,address;
		System.out.println("Enter the name:");
		name=sc.nextLine();
		System.out.println("Enter Address:");
		address=sc.nextLine();
		System.out.println("Enter mobile:");
		mobile=sc.nextLine();
		Employeee obj=new Employeee();
		obj.setname(name);
		obj.setaddress(address);
		obj.setmobile(mobile);
		obj.show();
		System.out.println("Verify and Update the menu:");
		obj.update();
	}
}