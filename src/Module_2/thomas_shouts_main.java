package Module_2;
import java.io.*;
public class thomas_shouts_main {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		thomas_shouts ob=new thomas_shouts();
		ob.calculate();
	}
}
