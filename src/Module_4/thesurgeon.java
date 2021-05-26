package Module_4;
import java.io.*;
public class thesurgeon extends thesurgeonabs{
	int n;
	thesurgeon(){
		n=0;
	}
	thesurgeon(int x){
		n=x;
	}
	@Override
	void report()throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String name[]=new String[n];
		String day[]=new String[n];
		int i;
		System.out.println("Enter the name of patient and day visited: ");
		for(i=0;i<n;i++) {
			name[i]=br.readLine();
			day[i]=br.readLine();
		}
		System.out.println("Last Week's Patients Report: ");
		for(i=0;i<n;i++) {
			System.out.println("Name of Patient: "+name[i]);
			System.out.println("Day Visited: "+day[i]);
			System.out.println();
		}
	}
}