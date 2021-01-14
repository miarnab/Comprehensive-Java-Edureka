package Module_3;
import java.io.*;
public class Fish extends Animal{
	String habitat;
	String type;
	Fish(){
		habitat=" ";
		type=" ";
	}
	Fish(String f,String h,String t) {
		super(f);
		habitat=h;
		type=t;
	}
}
