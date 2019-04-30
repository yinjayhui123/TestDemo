package fifteen;

import java.util.ArrayList;
import java.util.List;

import Entity.Flower;
import Entity.UserDto;

public class TwentyTwo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		ClassFactory<Employee> cf = new ClassFactory<Employee>(Employee.class);
		Employee e = cf.create();
		e.getT(); 
		Employee f = new Employee();
		//得到类的全名称（包含所在的包名） TwentyTwo.class.getName()
		System.out.println("name="+TwentyTwo.class.getName());
		
		//获取Calss对象的三种方式
		System.out.println("getClass1="+Employee.class);
		System.out.println("getClass2="+f.getClass());
		
		Employee e2 = Employee.class.newInstance();
		try {
			System.out.println("getClass3="+Class.forName(Employee.class.getName()));
//			System.out.println("getClass4="+Class.forName("fifteen.TwentyTwo"));
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		List<Integer> list223 = new ArrayList<>();
		
	}
	
	

}


class ClassFactory<T>{
	T t;
	
	public ClassFactory(Class<T> kind){
		try {
			t = kind.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public T create(){
		return t;
	}
}

class Employee{
	
	public Employee(){
		System.out.println("我是默认的构造方法");
	}
	
	static {
		System.out.println("静态构造方法");
	}
	
	{
		System.out.println("非静态构造");
	}
	
	public void getT(){
		System.out.println("啊哈哈的");
	}
}