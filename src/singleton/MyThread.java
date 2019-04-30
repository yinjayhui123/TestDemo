package singleton;

/**
 * @Author: yinhui
 * @Date: 2019/4/29 9:39
 * @Version 1.0
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
