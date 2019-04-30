package ceshi;

public class SonCircle extends ParentShape{
	
	public String st ;
	

	public String getSt() {
		return st;
	}

	public void setSt(String st) {
		this.st = st;
	}

	public SonCircle(){
		System.out.println("儿子 son被调用了");
	}
	
	public void move(){
		System.out.println("我可以移动");
	}
	
	//这是重载，因为方法名相同，但是入参不同
	public void square(int i){
		System.out.println("是儿子重载的正方形");
	}
	
	//这是重写，因为方法名、入参、返回值类型都一致。
	public void square(String names){
		System.out.println("是儿子重写的正方形="+names);
	}
}
