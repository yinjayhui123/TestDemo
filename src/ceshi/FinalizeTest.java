package ceshi;

public class FinalizeTest {

	TreeThree three = new TreeThree(1);
	
	public FinalizeTest(){
		System.out.println("我是FinalizeTest的构造器");
		three2 = new TreeThree(3);
	}
	static TreeThree three2 = new TreeThree(2);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeTwo two = new TreeTwo();
		two.check();
//		two = null;
//		System.gc();
//		System.runFinalization(); 
		
		
//		three.check();;
		FinalizeTest finalizeTest = new FinalizeTest();
		
	}

}

class TreeTwo {
	
	public TreeTwo(){
		System.out.println("我是父类的构造方法");
	}
	
	protected void check(){
		System.out.println("我执行了TreeTwo check");
	}
	
	public void finalize()  {
		System.out.println("我运行了一个finalize");
	}
}

class TreeThree extends TreeTwo{
	
	public TreeThree( int i){
		String b;
		System.out.println("我是子类的构造方法 i="+i);
	}
	
	static{
		System.out.println("我是静态初始化static");
	}
	
	{
		System.out.println("我是非静态初始化");
	}
	
	@Override
	public void check(){
		System.out.println("我执行了TreeThree check");
	}
//	
//	private void check2(){
//		System.out.println("我执行了TreeThree check");
//	}
}
