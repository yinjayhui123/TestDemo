package sixteen;

public class SixTest {
	
	public SixTest(){}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int f = 5;
//		char ch ='f';
//		//1
//		String b = f+"";
//		//2
//		String c =  new StringBuilder(String.valueOf(f)).toString();
//		//3
//		String d = String.valueOf(f);
//		
//		String sb = "";
//		for(int i=0;i<3;i++){
//			//业务
//			//
//			sb+=i;
//		}
		
//		StringBuilder sc ;
//		
//		for(int i=0;i<3;i++){
//			//业务
//			//
//			sc = new StringBuilder();
//			sc.append(String.valueOf(i)).toString();
//		}
		
		String  s1 = "A" + "hello";//1个对象    默认变成 Ahello 保存到s1    原因Java对String 的+做了优化：直接转换为一个字符串。  只在常量池中创建一个"Ahello"对象
		String s2 = "A";//1个对象         A
		String s3 = s2 + "hello";//1个对象   hello  原因：在常量池中找"A" "hello" "Ahello",能找到"A"和"Ahello"  所以只新建一个"hello"
		String s4 = s1 + s2 + s3;

	}
	
	public static void value(){
		StringBuilder sc  = new StringBuilder();;
		
		for(int i=0;i<3;i++){
			//业务
			sc.append(String.valueOf(i)).toString();
		}
	}

}
