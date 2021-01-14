package Module_2;
import java.io.*;
public class poor_stacy {
	int m;
	int n;
	poor_stacy(){
		n=0;
		m=0;
	}
	void input(int a,int b){
		m=a;
		n=b;
	}
	void calculate() {
		int i,p=1;
		for(i=1;i<=n;i++) {
			p=m*i;
			System.out.println(m+"*"+i+"="+p);
		}
	}
}
