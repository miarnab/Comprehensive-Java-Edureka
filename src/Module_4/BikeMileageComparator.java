package Module_4;

import java.util.Comparator;

public class BikeMileageComparator implements Comparator<BikeMileage>{
	@Override
	public int compare(BikeMileage o1,BikeMileage o2) {
		return o1.getMileage()-o2.getMileage();
	}
}
