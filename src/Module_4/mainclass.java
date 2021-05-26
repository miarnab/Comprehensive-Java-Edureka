package Module_4;
import java.io.*;
public class mainclass {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("What do you want to buy?");
		System.out.println("1. Apartment");
		System.out.println("2. Hostel");
		System.out.println("3. Office");
		System.out.println("4. Shopping Mall");
		System.out.println("Enter the user's choice: ");
		int ch=Integer.parseInt(br.readLine());
		switch(ch) {
		case 1:System.out.println("Enter the price per unit area: ");
			   int n1=Integer.parseInt(br.readLine());
			   System.out.println("Enter the area: ");
			   int area1=Integer.parseInt(br.readLine());
			   apartments ob1=new apartments(n1);
			   int total1=ob1.rooms(n1, area1);
			   ob1.display(total1);
			   break;
		case 2:System.out.println("Enter the price per unit area: ");
		   		int n2=Integer.parseInt(br.readLine());
		   		System.out.println("Enter the area: ");
		   		int area2=Integer.parseInt(br.readLine());
		   		hostels ob2=new hostels(n2);
		   		int total2=ob2.rooms(n2, area2);
		   		ob2.display(total2);
		   		break;
		case 3:System.out.println("Enter the price per unit area: ");
		   		int n3=Integer.parseInt(br.readLine());
		   		System.out.println("Enter the area: ");
		   		int area3=Integer.parseInt(br.readLine());
		   		offices ob3=new offices(n3);
		   		int total3=ob3.rooms(n3, area3);
		   		ob3.display(total3);
		   		break;
		case 4:System.out.println("Enter the price per unit area: ");
		   		int n4=Integer.parseInt(br.readLine());
		   		System.out.println("Enter the area: ");
		   		int area4=Integer.parseInt(br.readLine());
		   		malls ob4=new malls(n4);
		   		int total4=ob4.rooms(n4, area4);
		   		ob4.display(total4);
		   		break;
		default:System.out.println("Enter a valid choice");
		}
	}
}
