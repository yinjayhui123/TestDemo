package fifteen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sun.nio.cs.Surrogate.Generator;
import ten.Outer;
import ceshi.OuterSon;
import ceshi.SonCircle;

/**
 * 参数推断
 * @author Administrator
 *
 */
public class ElvenTest {

	
	public static void main(String[] str){
		List<String> list = New.list();
		list.add("adf");
		list.add("sdf");
		
		System.out.println(list.get(0));
		
		Map<String,List<String>> mapList = New.map();
		mapList.put("w", list);
		
		System.out.println(mapList.get("w"));
		
		Map<OuterSon,List<? extends Outer>> listOut = New.map();
		New.f(New.<OuterSon, List<Outer>>map());
		
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		System.out.println("c1=c2 ,"+ (c1==c2));
	}
}

class New{
	
	public static <T> List<T> list(){
		return new ArrayList<T>();
	}
	
	public static <T,M> Map<T,M> map(){
		return new HashMap<T,M>();
	}
	
	public static void f(Map<OuterSon,List<Outer>> map){
		
	}
	
	public static <T,B> List<T> makeList(T t,B... arg){
		List<T> list = new ArrayList<T>();
		for(B b:arg){
					}
		
		return new ArrayList<T>();
		
	}

}