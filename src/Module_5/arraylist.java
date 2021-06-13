package Module_5;
import java.io.*;
import java.util.*;
public class arraylist {
	int n;
	ArrayList<Integer> arr;
	arraylist(){
		n=0;
	}
	void input()throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the number of elements in the array list: ");
		int n=Integer.parseInt(br.readLine());
		arr=new ArrayList<Integer>(n);
		int i;
		System.out.println("Enter the elements in the array list: ");
		for(i=0;i<n;i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		System.out.println("The array list: "+arr);
		System.out.println("The size of the array list: "+arr.size());
	}
	void delete(int x) {
		int index=0;
		index=arr.indexOf(x);
		arr.remove(index);
		System.out.println("The resultant array list: "+arr);
		System.out.println("The index of the deleted item: "+index);
	}
}
