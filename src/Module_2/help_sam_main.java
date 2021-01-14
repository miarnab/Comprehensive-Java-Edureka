package Module_2;
import java.io.*;
public class help_sam_main {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the integer number: ");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Enter the fractional number: ");
		double b=Double.parseDouble(br.readLine());
		help_sam ob1=new help_sam(a);
		help_sam ob2=new help_sam(b);
		ob1.display_integer();
		ob2.display_fraction();
	}
}
