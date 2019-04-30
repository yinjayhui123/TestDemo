package ceshi;

import java.util.Random;

public class EqualsMethodTest {

	public static void main(String[] args) {

		Values v1 = new Values();
		Values v2 = new Values();
		
		v1.i = v2.i = 100;
		System.out.println(v1.equals(v2));
		
		double dbMax = Double.MAX_VALUE;
		double dbMin = Double.MIN_VALUE;
		System.out.println("dbMax"+dbMax);
		
		float flMax = Float.MAX_VALUE;
		
		int i1 =31;
		int i2 =3;
		float fl = 21.5f;
		double d1 = 24.6d;
		System.out.println("i1 &= i2 "+ (int)d1);
		
//		Math.round(a)
		Random ra = new Random();
		int[] mathInt = new int[25];
		for(int i=0;i<mathInt.length;i++){
			mathInt[i] = ra.nextInt(10);
		}
		
		for(int j =0;j<24;j++){
			
			if(mathInt[j] > mathInt[j+1]){
				System.out.println(mathInt[j] +">"+ mathInt[j+1]);
			}else if(mathInt[j] == mathInt[j+1]){
				System.out.println(mathInt[j] +"=="+ mathInt[j+1]);
			}else{
				System.out.println(mathInt[j] +"<"+ mathInt[j+1]);
			}
		}
		
		switch ("a") {
		case "a":
			
			break;

		default:
			break;
		}
	}

}

class Values{
	int i;
}
