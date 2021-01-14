package Module_2;
import java.io.*;
public class thomas_shouts {
	String ch;
	int n;
	double m;
	double e;
	double h;
	double s;
	double ss;
	thomas_shouts(){
		ch=" ";
		n=0;
		m=0.00;
		e=0.00;
		h=0.00;
		s=0.00;
		ss=0.00;
	}
	void calculate()throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the number of students: ");
		int n=Integer.parseInt(br.readLine());
		int i;
		double sum=0.00,avg;
		for(i=0;i<n;i++) {
			System.out.println("Enter 'Yes' to continue and 'No' to stop.");
			System.out.println("Enter the user's choice: ");
			String ch=br.readLine();
			switch(ch) {
				case "Yes":System.out.println("Enter the marks in Mathematics: ");
							double m=Double.parseDouble(br.readLine());
							System.out.println("Enter the marks in English: ");
							double e=Double.parseDouble(br.readLine());
							System.out.println("Enter the marks in Hindi: ");
							double h=Double.parseDouble(br.readLine());
							System.out.println("Enter the marks in Science: ");
							double s=Double.parseDouble(br.readLine());
							System.out.println("Enter the marks in Social Science: ");
							double ss=Double.parseDouble(br.readLine());
							if((m>=0.00&&m<=100.00)&&(e>=0.00&&e<=100.00)&&(h>=0.00&&h<=100.00)&&(s>=0.00&&s<=100.00)&&(ss>=0.00&&ss<=100.00)) {
							sum=m+e+h+s+ss;
							avg=sum/5;
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
						else {
							System.out.println("Please enter a valid marks of the students.");
						}
							break;
				case "No":System.out.println("The user chose to exit.");
							break;
				default:System.out.println("Enter the valid choice.");
			}
		}
	}
}
