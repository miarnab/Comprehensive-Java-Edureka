package Module_2;
import java.io.*;
public class help_sam {
	int num1;
	double num2;
	help_sam(){
		num1=0;
		num2=0.00;
	}
	help_sam(int x){
		num1=x;
	}
	help_sam(double y){
		num2=y;
	}
	void display_integer() {
		System.out.println("The integer value is: "+num1);
	}
	void display_fraction() {
		System.out.println("The float value is: "+num2);
	}
}
