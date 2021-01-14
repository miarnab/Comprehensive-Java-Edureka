package Module_1;
import java.io.*;
public class friends {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the number from Michael: ");
		double a=Double.parseDouble(br.readLine());
		System.out.println("Enter the number from Bruce: ");
		double b=Double.parseDouble(br.readLine());
		if(a>b) {
			System.out.println("Bruce should forget about the girl and get out of Michael's way.");
		}
		else {
			System.out.println("Michael should forget about the girl and get out of Bruce's way.");
		}
	}
}
