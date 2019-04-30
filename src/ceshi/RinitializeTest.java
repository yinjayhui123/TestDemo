package ceshi;

public class RinitializeTest {

	public RinitializeTest(){
		System.out.println("我是类 被初始化");
	}
	
	public RinitializeTest(String v){
		this.st = v;
	}
	public  String va ="hello";
	public String st;
	
	
	public static void main(String[] args) {
		
		RinitializeTest r = new RinitializeTest();
		System.out.println(r.va);
		System.out.println(r.st);
		
		Dog Dog = new Dog();
		
		getTree(1,"b");
		
	}
	
	public static void getTree(String s,int b){
		System.out.println("1="+s+b);
	}
	
	public static void getTree(int b,String s){
		System.out.println("2="+s+b);
	}
	
}

class Dog{
	
	
}
