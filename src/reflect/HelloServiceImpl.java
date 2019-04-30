package reflect;

/**
 * @Author: yinhui
 * @Date: 2019/3/29 15:38
 * @Version 1.0
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayhello(String name) {
        System.out.println("hello "+ name);
    }
}
