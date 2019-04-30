package reflect;

/**
 * @Author: yinhui
 * @Date: 2019/3/29 15:52
 * @Version 1.0
 */
public class ProxyTest {

    public static void main(String[] art){
        HelloServiceProxy proxy = new HelloServiceProxy();
        HelloService helloService = new HelloServiceImpl();

        helloService = (HelloService) proxy.bind(helloService);
        helloService.sayhello("李四");
    }
}
