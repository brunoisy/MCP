import java.util.ArrayList;
import java.util.Collections;

public class PortionSet {

	private ArrayList<MyPortion> portions;

	public PortionSet() {
		portions = new ArrayList<>();
	}

	public void addPortion(MyPortion portion) {
		portions.add(portion);
		Collections.sort(portions);
		disjoint();
	}

	public void disjoint() {
		ArrayList<MyPortion> newPortions = new ArrayList<>(); //pas très efficace
		int begin = 0;
		int end = 0;

		for (int i = 0; i < portions.size(); i++) {
			Portion thisPortion = portions.get(i);
			if (i == 0) {
				begin = thisPortion.getBegin();
				end = thisPortion.getEnd();
			} else {
				if (thisPortion.getBegin() > end) {
					newPortions.add(new MyPortion(begin, end));
					begin = thisPortion.getBegin();
					end = thisPortion.getEnd();
				} else
					end = thisPortion.getEnd();
			}
			if (i == portions.size() - 1)
				newPortions.add(new MyPortion(begin, end));
		}
		portions = newPortions;
	}


	public Portion[] getPortions() {
		return (Portion[]) portions.toArray();
	}
}