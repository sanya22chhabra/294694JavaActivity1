import java.util.*;
public class customer {
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
class Customermain
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String sent,sent1;
		customer e=new customer();
		System.out.println("Enter the details: ");
		sent=sc.nextLine();
		sent1=sent+",";
		String [] arr=sent1.split("[,]",0);
		for(int i=0;i<1;i++) {
			e.setname(arr[i]);
			e.setaddress(arr[i+1]);
			e.setmobile(arr[i+2]);
		}
		e.show();
	}
}