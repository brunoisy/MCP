import java.util.ArrayList;

public class PortionSet{

	private ArrayList<Portion> portions;

	public PortionSet(){
		portions = new ArrayList<Portion>();
	}

	public void addPortion(Portion portion){
		for(Portion p:portions){
			if(portion.getEnd() < p.getBegin())
				portions.add(1,portion);
			else
				if(portion.getBegin() < p.getBegin()){
					Portion newPortion = new myPortion(portion.getBegin(), p.getEnd());
				}

		}
	}

	public Portion[] getPortions(){
		return portions.toArray();
	}
}