package sixteen;

import java.util.Arrays;
import java.util.Random;

public class OneTest {
	
	static  final String[] FLA = {"wo","shi","gao","lin"};
	
	public static void main(String[] str){
		OneTest[] o = new OneTest[]{new OneTest(),new OneTest()};
		int[] i = new int[5];
		Integer[] in = new Integer[2];
		test(o);
		test(in);
		testint(i);
		
		System.out.println(Arrays.toString(getT(3)));
		
	}
	
	public static <T> void test(T[] t){
		System.out.println("T[]="+Arrays.toString(t));
	}
	
	public static void testint(int[] t){
		System.out.println("int[]="+Arrays.toString(t));
	}
	
	public static String[] getT(int s){
		Random rand = new Random(22);
		String[] str = new String[s];
		boolean[] picked = new boolean[FLA.length];
		for(int i = 0;i<s;i++){
			int t;
			do 
				t = rand.nextInt(FLA.length);
			while(picked[t]);
			
			str[i] = FLA[t];
			picked[t] = true;
		}
		return str;
	}

}
