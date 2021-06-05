package inherit;
import java.util.*;
public class Vehicle {
	protected String make;
	protected String vehicalnumber;
	protected String fueltype;
	protected int fuelcapacity;
	protected int cc;
	public Vehicle(String m,String vnum,String ft,Integer fc,Integer cc) {
		this.make = m;
		this.vehicalnumber = vnum;
		this.fueltype = ft;
		this.fuelcapacity = fc;
		this.cc= cc;
	}
	public String getmake() 
	{
		return make;
	}
	public void setmake(String m) {
		this.make=m;
	}
	public String getft() 
	{
		return fueltype;
	}
	public void setft(String ft) {
		this.fueltype=ft;
	}
	public int getfc() 
	{
		return fuelcapacity;
	}
	public void setfc(int fc) {
		this.fuelcapacity=fc;
	}
	public String getvnum() 
	{
		return vehicalnumber;
	}
	public void setvnum(String vnum) {
		this.vehicalnumber=vnum;
	}
	public int getcc() 
	{
		return cc;
	}
	public void setcc(int cc) {
		this.cc=cc;
	}
	public void displaymake()
	{
		System.out.println("*** "+make+" ***");
	}
	public void displaybasicinfo(){
		System.out.println("---Basic Information---");
		System.out.println("VehicalNumber :"+vehicalnumber);
		System.out.println("\nFuelType :"+fueltype);
		System.out.println("\nFuelCapacity :"+fuelcapacity);
		System.out.println("\nEngine CC :"+cc);
	}
	public void displaydetailinfo() {
		System.out.println("---Detail Information---");
	}
}
class TwoWheeler extends Vehicle{
	private boolean kickstartavailable;
	public Boolean getksa() 
	{
		return kickstartavailable;
	}
	public void setksa(Boolean ksa) {
		this.kickstartavailable=ksa;
	}
	public TwoWheeler(String m,String vnum,String ft,Integer fc,Integer cc,boolean ksa)
	{
		super(m, vnum, ft, fc,cc);
		this.kickstartavailable=ksa;
	}
	public void displaydetailinfo(boolean ksa) {
		super.displaydetailinfo();
		System.out.print("Kick Start Available:");
		if(kickstartavailable)
			System.out.println("Yes");
		else
			System.out.println("No");
	}	
}

class FourWheeler extends Vehicle{
	private String audiosystem;
	private int numberofdoors;
	public String getas() 
	{
		return audiosystem;
	}
	public void setas(String audio) {
		this.audiosystem=audio;
	}
	public int getnd() 
	{
		return numberofdoors;
	}
	public void setas(int doors) {
		this.numberofdoors=doors;
	}
	public FourWheeler(String m,String vnum,String ft,Integer fc,Integer cc,String audio,int doors) {
		super(m,vnum,ft,fc,cc);
		this.audiosystem=audio;
		this.numberofdoors=doors;
		
	}
	public void displaydetailinfo(String audio,int doors)
	{
		super.displaydetailinfo();
		System.out.println("AudioSystem: "+audiosystem);
		System.out.println("\nNumberOfDoors: "+numberofdoors);
	}
}
class Main{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int cc,fc,doors;
		String vt,make,vnum,ft,audio,ks;
		boolean ksa;
		System.out.println("1. FourWheeler");
		System.out.println("2. TwoWheeler");
		System.out.println("\nEnter VehicleType: ");
		vt=sc.nextLine();
		System.out.println("\nVehicle Make: ");
		make=sc.nextLine();
		System.out.println("\nVehicle Number: ");
		vnum=sc.nextLine();
		System.out.println("\nFuelType: ");
		System.out.println("\n1.Petrol ");
		System.out.println("\n2. Diesel ");
		ft=sc.nextLine();
		System.out.println("\nFuel Capacity: ");
		fc=sc.nextInt();
		System.out.println("\nEngine CC: ");
		cc=sc.nextInt();
		if(vt.equals("1")) {
			System.out.println("Audio System: ");
			audio=sc.next();
			System.out.println("Number of Doors: ");
			doors=sc.nextInt();
			FourWheeler obj=new FourWheeler(make,vnum,ft,fc,cc,audio,doors);
			obj.displaymake();
			obj.displaybasicinfo();
			obj.displaydetailinfo(audio,doors);
					}
		else
		{
			System.out.println("Kick Start Available: ");
			ks=sc.next();	
			if(ks.equalsIgnoreCase("yes"))
				ksa=true;
			else
				ksa=false;
			TwoWheeler obj1=new TwoWheeler(make,vnum,ft,fc,cc,ksa);
			obj1.displaymake();
			obj1.displaybasicinfo();
			obj1.displaydetailinfo(ksa);
		}
	}
}