package class1;

import java.util.Comparator;

public class CompareByDate implements Comparator<flights> {

	@Override
	public int compare(flights f1, flights f2) {	
		return f1.dateTime.compareTo(f2.dateTime);
	}
}
