package Module_5;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class hash_map {
	String key;
	int value;
	hash_map(){
		key=" ";
		value=0;
	}
	void input_and_display()throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		HashMap<String, Integer> hashmap=new HashMap<String, Integer>();
		int i;
		System.out.println("Enter the number of key and value pairs you want to enter: ");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter the key value pairs: ");
		for(i=0;i<n;i++) {
			key=br.readLine();
			value=Integer.parseInt(br.readLine());
			hashmap.put(key, value);
		}
		Iterator<Entry<String, Integer>> iterator=hashmap.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry= (Map.Entry<String, Integer>) iterator.next();
			System.out.print(entry.getKey()+" : ");
			System.out.println(entry.getValue());
		}
	}
}
