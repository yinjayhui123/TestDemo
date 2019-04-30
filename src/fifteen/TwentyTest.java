package fifteen;

import ceshi.WindSon;
import nine.WindInterface;

public class TwentyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WindSon son = new WindSon();
		ReturnType<WindSon> re = new ReturnType();
		re.get(son);
	}

}

class ReturnType<T extends WindInterface>{
	
	private T obj;
	
	public ReturnType(){}
	
	public ReturnType(T t){
		obj = t;
	}
	
	public void get(T t){
		t.run();
	}
}
