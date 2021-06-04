import java.util.*;
public class innings 
{
	private String teamname;
	private String inningsname;
	private int runs;
	public String getname() 
	{
		return teamname;
	}
	public void setname(String tn)
	{
		this.teamname=tn;
	}
	public String getinningsname() 
	{
		return inningsname;
	}
	public void setinningsname(String inm)
	{
		this.inningsname=inm;
	}
	public int getruns() 
	{
		return runs;
	}
	public void setruns(int r)
	{
		this.runs=r;
	}
	public void displayInningsDetails()
	{
		System.out.println("Name: "+teamname);
		System.out.println("Score: "+runs);
		if(inningsname.equalsIgnoreCase("first"))
			System.out.println("Need "+(runs+1)+" to win");
		else
			System.out.println("Match ended\n");
	}
}
 class Inningsmain{
	 public static void main(String []args) {
		 Scanner sc = new Scanner(System.in);
			String tn,inm,tnn,inmm;
			int r,rr;
			System.out.println("Sample Input:");
			System.out.println("Enter the team name:");
			tn=sc.nextLine();
			System.out.println("Enter session:");
			inm=sc.nextLine();
			System.out.println("Enter runs:");
			r=sc.nextInt();
			innings obj= new innings();
			obj.setname(tn);
			obj.setinningsname(inm);
			obj.setruns(r);
			obj.displayInningsDetails();
			
			System.out.println("\nSample Input:");
			System.out.println("Enter the team name:");
			tnn = sc.next();
			System.out.println("Enter session:");
			inmm = sc.next();
			System.out.println("Enter runs:");
			rr=sc.nextInt();
			innings obj1= new innings();
			obj1.setname(tnn);
			obj1.setinningsname(inmm);
			obj1.setruns(rr);
			obj1.displayInningsDetails();
 }
}