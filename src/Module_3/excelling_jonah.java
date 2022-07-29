package Module_3;
import java.io.*;
public class excelling_jonah {
	int a;
	int b;
	double c;
	double d;
	excelling_jonah(){
		a=0;
		b=0;
		c=0.00;
		d=0.00;
	}
	int calculate(int x,int y){
		a=x;
		b=y;
		int p=1;
		p=x*y;
		return p;
	}
	double calculate(double x,double y) {
		c=x;
		d=y;
		double p=1.00;
		p=c*d;
		return p;
	}
}
