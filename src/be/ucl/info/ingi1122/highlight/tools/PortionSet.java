package be.ucl.info.ingi1122.highlight.tools;

public class PortionSet{

	private ArrayList<Portion> portions;

	public PortionSet(){
		portions = new ArrayList<Portion>();
	}

	public void addPortion(Portion portion){
		for(Portion p:portions){
			if(portion.end < p.begin)
				portions.add(portion,1);

		}
	}
}