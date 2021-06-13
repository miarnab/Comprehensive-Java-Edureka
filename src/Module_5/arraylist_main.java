package Module_5;
import java.io.*;
public class arraylist_main {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		arraylist ob=new arraylist();
		ob.input();
		System.out.println("Enter the value to delete in the array list: ");
		int b=Integer.parseInt(br.readLine());
		ob.delete(b);
	}
}
