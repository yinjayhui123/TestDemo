package Entity.imple;

import Entity.Flower;

public class FlowerSon extends Flower{
	
	public void setBB(){
		FlowerSon f = new FlowerSon();
		super.rose();
	}
	//玫瑰花
	public void chrysanthemum(){
		System.out.println("我是子类的 chrysanthemum");
	}
	
	//子类重写父类的static 方法
	public static void statMethod(){
		System.out.println("子类重写父类的static 方法");
	}
	
	public  void sFinal(){
		System.out.println("父类定义 final方法");
	}

}
