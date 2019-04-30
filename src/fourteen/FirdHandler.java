package fourteen;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK 动态代理
 * @author Administrator
 *
 */
public class FirdHandler implements InvocationHandler{
	
	private Object ob;
    public FirdHandler(Object ob) {
		// TODO Auto-generated constructor stub
    	this.ob = ob;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		Object b = method.invoke(ob, args);
		return b;
	}

}
