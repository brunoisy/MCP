import java.util.ArrayList;

import java.util.Collections;

public class PortionSet{

	private ArrayList<MyPortion> portions;

	public PortionSet(){
		portions = new ArrayList<MyPortion>();
	}

	public void addPortion(MyPortion portion){
		portions.add(portion);
		Collections.sort(portions);
		portions.disjoint();
	}

	public void disjoint(){
		for(Portion p : portions){
			if(p.)
		}
	}



	public Portion[] getPortions(){
		return (Portion [])portions.toArray();
	}
}