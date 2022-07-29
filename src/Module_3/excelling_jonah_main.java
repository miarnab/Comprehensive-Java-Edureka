package Module_3;
import java.io.*;
public class excelling_jonah_main {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the first integer number: ");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Enter the second integer number: ");
		int b=Integer.parseInt(br.readLine());
		System.out.println("Enter the first floating number: ");
		double c=Double.parseDouble(br.readLine());
		System.out.println("Enter the second floating number: ");
		double d=Double.parseDouble(br.readLine());
		excelling_jonah ob=new excelling_jonah();
		int res1=ob.calculate(a, b);
		System.out.println("The product of integer numbers is: "+res1);
		double res2=ob.calculate(c, d);
		System.out.println("The product of float numbers is: "+res2);
	}
}
