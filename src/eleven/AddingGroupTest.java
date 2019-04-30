package eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> coll = new ArrayList<String>();
		
		String[] str = {"1","2","3"};
		List<String> as = Arrays.asList(str);
		 Collections.addAll(coll, str);
		 Collections.addAll(coll, "yin","hui");
		 
		 List<String> collList = (List<String>) coll;//向下转型
		 for(String dto : coll){
			 dto="2";
		 }
		 
		 System.out.println(collList);
		 
		 setg("234","3444");
	}
	
	public static void setg(String... st){
		for(String sb: st){
			System.out.println(sb);
		}
	}

}
