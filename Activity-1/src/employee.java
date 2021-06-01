import java.util.*;

public class employee {
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
}
class employeemain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n,mb,ad;
		System.out.println("Sample Input:");
		n=sc.nextLine();
		ad=sc.nextLine();
		mb=sc.nextLine();
		employee e= new employee();
		e.setname(n);
		e.setaddress(ad);
		e.setmobile(mb);
		e.show();	
}
}
