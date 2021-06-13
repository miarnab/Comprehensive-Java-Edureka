package Module_5;
import java.io.*;
public class io_operations {
	int a;
	int b;
	io_operations(){
		a=0;
		b=0;
	}
	void input(int x,int y) {
		a=x;
		b=y;
	}
	void addition() {
		int sum=0;
		sum=a+b;
		System.out.println("The sum of the numbers: "+sum);
	}
	void difference() {
		int d=0;
		if(a>b) {
			d=a-b;
			System.out.println("The difference between the numbers: "+d);
		}
		else {
			d=b-a;
			System.out.println("The difference between the numbers: "+d);
		}
	}
	void multipliy() {
		int p=1;
		p=a*b;
		System.out.println("The product of the numbers: "+p);
	}
}
