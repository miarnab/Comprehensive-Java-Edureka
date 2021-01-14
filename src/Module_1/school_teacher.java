package Module_1;
import java.io.*;
public class school_teacher {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the marks of Mathematics: ");
		double m=Double.parseDouble(br.readLine());
		System.out.println("Enter the marks of English: ");
		double e=Double.parseDouble(br.readLine());
		System.out.println("Enter the marks of Hindi: ");
		double h=Double.parseDouble(br.readLine());
		System.out.println("Enter the marks of Science: ");
		double s=Double.parseDouble(br.readLine());
		System.out.println("Enter the marks of Social Science: ");
		double ss=Double.parseDouble(br.readLine());
		double sum=0.00,avg;
		sum=m+e+h+s+ss;
		avg=sum/5;
		System.out.println("The Percentage of the student is: "+avg);
		if(avg>=90.00) {
			System.out.println("Excellent");
		}
		else if(avg>=80&&avg<90) {
			System.out.println("Very Good");
		}
		else if(avg>=60&&avg<80) {
			System.out.println("Good");
		}
		else if(avg>=40&&avg<60) {
			System.out.println("Average");
		}
		else {
			System.out.println("Poor");
		}
	}
}
