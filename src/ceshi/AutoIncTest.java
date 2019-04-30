package ceshi;

/**
 * 自动递增  ++i 和 i++ 
 * @author Administrator
 *
 */
public class AutoIncTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ci =0 ;
		ci = ci++;
		System.out.println("ci++="+ci);
		
		int s=0;
		for(feel('A'); feel('B') && (s<1);feel('C')){
			feel('D');
			s++;
		}
		
		int b = 0;
		for(int i=0;i<5;i++){
			b = b++;
		}
		System.out.println("");
		System.out.println(" b="+ b);
		
		for(int g = 0;g<3;){
			System.out.println("g="+ ++g);
		}
		
		//值传递
		int str = 20;
		int value = 10;
		String st = "hello";
		setValue(str, value,st);
		System.out.println("str2="+str+",value2="+value+",st="+st);
	}
	
	public static boolean feel(char f){
		System.out.print(" "+f);
		return true;
	}
	
	private static void setValue(int str,int value,String s){
		int temp = str;
		str = value;
		value = temp;
		
		char data[] = {'b','c'};
		String sb = new String(data);
		s = sb;
		System.out.println("str="+str+",value="+value+",s="+s);
		
	}

}
