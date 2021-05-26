package Module_4;
import java.io.*;
public class thesurgeonmain {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the number of patients visited: ");
		int n1=Integer.parseInt(br.readLine());
		thesurgeonabs ob=new thesurgeon(n1);
		ob.report();
	}
}
