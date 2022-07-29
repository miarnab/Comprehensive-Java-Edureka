package Module_3;
import java.io.*;
public class inquisitive_jonah_main {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the four inputs:");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		double c=Double.parseDouble(br.readLine());
		double d=Double.parseDouble(br.readLine());
		inquisitive_jonah_2 ob=new inquisitive_jonah_2();
		int res1=ob.calculate(a,b);
		System.out.println("The sum of the given numbers: "+res1);
		double res2=ob.calculate(c,d);
		System.out.println("The sum of the given float numbers: "+res2);
	}
}
