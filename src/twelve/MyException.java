package twelve;

public class MyException extends Exception{

	String name ;
	public MyException(){
		System.out.println("MyException 初始化");
	}
	
	public MyException(String name){
		super(name);
		this.name = name;
	}
	
	public void show(){
		System.err.println("name="+ name);
	}
}
