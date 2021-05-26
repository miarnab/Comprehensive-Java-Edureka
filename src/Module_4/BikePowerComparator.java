package Module_4;

import java.util.Comparator;

public class BikePowerComparator implements Comparator<BikePower>{
	@Override
	public int compare(BikePower o1,BikePower o2) {
		return o1.getPower()-o2.getPower();
	}
}
