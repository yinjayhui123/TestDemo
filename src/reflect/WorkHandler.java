package reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: yinhui
 * @Date: 2019/3/29 16:14
 * @Version 1.0
 */
public class WorkHandler implements InvocationHandler {

    private Object target;

    public WorkHandler(){}

    public WorkHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        method.invoke(proxy)
        return null;
    }
}
