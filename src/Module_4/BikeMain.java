package Module_4;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
public class BikeMain {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		final List<BikePerformance> list1=Arrays.asList(BikePerformance.values());
		TreeSet<BikePerformance> ranks1= new TreeSet<BikePerformance>(new BikePerformanceComparator());
		ranks1.addAll(list1);
		System.out.println("Bikes in order of increasing performance: ");
		for(BikePerformance rank:ranks1) {
			System.out.println(rank);
		}
		final List<BikeMileage> list2=Arrays.asList(BikeMileage.values());
		TreeSet<BikeMileage> ranks2=new TreeSet<BikeMileage>(new BikeMileageComparator());
		ranks2.addAll(list2);
		System.out.println("Bikes in order of increasing mileage: ");
		for(BikeMileage rank:ranks2) {
			System.out.println(rank);
		}
		final List<BikePower> list3=Arrays.asList(BikePower.values());
		TreeSet<BikePower> ranks3=new TreeSet<BikePower>(new BikePowerComparator());
		ranks3.addAll(list3);
		System.out.println("Bikes in order of increasing power: ");
		for(BikePower rank:ranks3) {
			System.out.println(rank);
		}
	}
}
