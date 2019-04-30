package reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: yinhui
 * @Date: 2019/3/29 15:39
 * @Version 1.0
 */
public class HelloServiceProxy implements InvocationHandler {

    private Object target ;

    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("说hello之前");
        Object object = method.invoke(target,args);
        System.out.println("说完hello了");
        return object;
    }
}
