package Module_2;
import java.io.*;
public class poor_stacy_main {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the number you want to find multiples of: ");
		int x=Integer.parseInt(br.readLine());
		System.out.println("Enter the number upto which you want to find the multiple of: ");
		int y=Integer.parseInt(br.readLine());
		poor_stacy ob=new poor_stacy();
		ob.input(x,y);
		ob.calculate();
	}
}
