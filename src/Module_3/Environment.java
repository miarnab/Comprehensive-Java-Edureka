package Module_3;
import java.io.*;
public class Environment {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the Animal Family: ");
		String f=br.readLine();
		System.out.println("Enter the Fish Habitat: ");
		String h=br.readLine();
		System.out.println("Enter the Fish Type: ");
		String t=br.readLine();
		System.out.println("Enter the Shark Kind: ");
		String k=br.readLine();
		Shark ob=new Shark(f,h,t,k);
		ob.display();
	}
}
