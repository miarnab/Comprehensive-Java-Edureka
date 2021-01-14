package Module_1;
import java.io.*;
public class jack_and_jill {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter a number between 1 to 10.");
		System.out.println("Enter Jill's choice: ");
		int ch=Integer.parseInt(br.readLine());
		switch(ch) {
			case 1:System.out.println("You have chosen number 1.");
					break;
			case 2:System.out.println("You have chosen number 2.");
					break;
			case 3:System.out.println("You have chosen number 3.");
					break;
			case 4:System.out.println("You have chosen number 4.");
					break;
			case 5:System.out.println("You have chosen number 5.");
					break;
			case 6:System.out.println("You have chosen number 6.");
					break;
			case 7:System.out.println("You have chosen number 7.");
					break;
			case 8:System.out.println("You have chosen number 8.");
					break;
			case 9:System.out.println("You have chosen number 9.");
					break;
			case 10:System.out.println("You have chosen number 10.");
					break;
			default:System.out.println("Please enter a choice.");
		}
	}
}
