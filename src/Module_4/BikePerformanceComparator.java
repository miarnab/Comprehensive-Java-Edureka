package Module_4;

import java.util.Comparator;

public class BikePerformanceComparator implements Comparator<BikePerformance>{
	@Override
	public int compare(BikePerformance o1,BikePerformance o2) {
		return o1.getPerformance()-o2.getPerformance();
	}
}
