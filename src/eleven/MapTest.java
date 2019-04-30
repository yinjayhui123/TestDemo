package eleven;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//从数据库中查询出来的值转成Map是不带泛型结构的
		Map map = new HashMap();
		map.put("1", 1);
		map.put("2", "2");
		
		//而不带泛型结构的Map可以直接赋值给带泛型结构的Map<k,v>,风险点就是在运行的时候会出现错误类型的转换，Integer不可以直接转String
		//为什么非泛型的Map可以转换到泛型的Map？因为JVM在编译期间的时候会将泛型擦除，就直接变成Map了，两个相同的Map当然可以直接赋值了
		//通过JD-gui工具反编译 MapTest.class 就会看到  Map<String, String> strmap = new HashMap<String, String>() 的泛型就会被擦除成为： Map strmap = new HashMap();
		Map<String, String> strmap = new HashMap<String, String>();
		strmap = map;
		String val = null;
		String val2 = null;
		val = strmap.get("1");
		val2 = strmap.get("2");
		
		
		System.out.println("val="+val+",val2="+val2);
			 
	}

}
