package Entity;

import Entity.imple.FlowerSon;

public class Flower {

	public static Flower fe = new FlowerSon();
	
	public Flower(){}
	
	public Flower(int i){
		 fe.sFinal();
		System.out.println("www");
	}
	
	//玫瑰花
	protected void rose(){
		System.out.println("每个女人都喜欢玫瑰花，所以要保护起来");
	}
	
	//菊花
	public void chrysanthemum(){
		System.out.println("菊花用来泡茶喝，所以大家都可以用");
	}
	
	//牡丹花
	@SuppressWarnings("unused")
	private void  peonyFlower(){
		System.out.println("牡丹花也还行，所以要私藏");
	}
	
	//父类的static 方法
	public static void statMethod(){
		System.out.println("父类的static 方法");
	}
	
	private   void sFinal(){
		System.out.println("ff");
	}
	
public static void main(String[] args) {
	 Flower fe2 = new FlowerSon();
	
	}
}
