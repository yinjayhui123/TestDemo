package thirteen;

import java.util.ArrayList;
import java.util.List;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = null;
		StringBuilder sb = null;
		List<StringTest> list = new ArrayList<StringTest>();
		for(int i=0;i<10;i++){
//			list.add(String.valueOf(i));
			list.add( new StringTest());
		}
		System.out.println(list.toString());
	}
	
	public String toString(){
		return " StringTest address:"+ super.toString() +"\n";
	}

}
