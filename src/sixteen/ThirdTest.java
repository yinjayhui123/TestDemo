package sixteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] i = new int[2][3];
		
		int[][] s = {{1,3,4},{3},{23,5}};
		System.out.println("2维数组="+Arrays.deepToString(s));
		
		List<String>[] st = null;
		List[] list = new ArrayList[2];
		st = (List<String>[])list;
		st[0] = new ArrayList<String>();
		st[0].add("2");
		st[1] = new ArrayList<String>();
		st[1].add("3");
		System.out.println(Arrays.toString(st));
		
		
		List<String> st1 = new ArrayList<>();
		st1.add("3");
		List<String> st2 = new ArrayList<>();
		st2.add("5");
		st1.addAll(st2);
		System.out.println("多个List="+st1);
		
		List<String> ls = Arrays.asList("1","3");
		Integer si = 0;
		
		Number nu = new Integer("1");
		System.out.println("nu="+nu);
//		List<>
		
	}

}
