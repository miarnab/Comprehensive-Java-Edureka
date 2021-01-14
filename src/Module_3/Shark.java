package Module_3;
import java.io.*;
public class Shark extends Fish{
	String kind;
	Shark(){
		kind=" ";
	}
	Shark(String f,String h,String t,String k){
		super(f,h,t);
		kind=k;
	}
	void display() {
		System.out.println(kind+" is an "+family+" which lives in "+habitat+", hence it is "+type+".");
	}
}
