/**
 * Created by brunoob on 25.04.16.
 */
public class MyPortion implements Portion{

	private int begin;
	private int end;

	public MyPortion(int begin, int end){
		this.begin = begin;
		this.end = end;
	}

	public int getBegin(){
		return begin;
	}

	public int getEnd(){
		return end;
	}
}
