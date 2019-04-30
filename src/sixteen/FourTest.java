package sixteen;

import java.util.ArrayList;
import java.util.List;

public class FourTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试
		List<Apple> lfapp = new ArrayList<Apple>();
		Apple dota = new Apple();
		dota.setName("yinhui");
		lfapp.add(dota);

		//编译出错，因为泛型是不变性，不能将参数直接向上转型定义。如果需要实现向上转型关系，就必须实现协办
//		List<Fruit> lf = new ArrayList<Apple>();//编译出错
		//? extends Fruit 就是协变
		List<? extends Fruit> lf = new ArrayList<Apple>();
		lf=lfapp;
		//编译出错,因为执行了向上转型后，丢失了向其中传递任何对象的能力，.add()的时候都是null的
//		lf.add(new Apple());//编译出错
		//使用 extends 声明的泛型，只能从其中取值，不能向其中添加值，但是必须使用Fruit来接受元素
		Fruit fruit = lf.get(0);
		Apple aplle = (Apple) lf.get(0);
		Yinhui yinhui = (Yinhui)lf.get(0);
		
		List<? extends Apple> lfa = new ArrayList<Apple>();
		Fruit fu2 = lfa.get(0);
		
		
		
	}

}

class Fruit{}

class Apple extends Fruit{
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Yinhui extends Apple{}

class Orange extends Fruit{}
