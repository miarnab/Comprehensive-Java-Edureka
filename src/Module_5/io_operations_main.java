package Module_5;
import java.io.*;
public class io_operations_main {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the first number: ");
		int a1=Integer.parseInt(br.readLine());
		System.out.println("Enter the second number: ");
		int b1=Integer.parseInt(br.readLine());
		io_operations ob=new io_operations();
		ob.input(a1,b1);
		ob.addition();
		ob.difference();
		ob.multipliy();
	}
}
