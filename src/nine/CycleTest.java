package nine;

import nineteen.Food;
import twelve.MyException;

import java.lang.reflect.Method;

public class CycleTest {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		// TODO Auto-generated method stub

//		Food food = Food.Coffee.LATTE;

		MyException cys = new MyException();

		Class s = Integer.TYPE;

		Class clazz = Class.forName("twelve.MyException");
		MyException my =(MyException) clazz.newInstance();
		for(Method method : clazz.getMethods()){
//			System.out.println("Food接口里面有哪些方法："+method.getName());
		}
	}

	
}
