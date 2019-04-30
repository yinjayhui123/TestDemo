package thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: yinhui
 * @Date: 2019/4/28 10:23
 * @Version 1.0
 */
public class ProducerConsumerByBQ {

    public static void main(String[] str){

        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        ThreadLocal<String> threadLocal = new ThreadLocal<String>(){
            @Override
            protected String initialValue() {
                return "初始值";
            }
        };

        System.out.println(threadLocal.get());

        Thread producer1 = new Producer("p-1",queue);
        Thread producer2 = new Producer("p-2",queue);
        Thread consumer1 = new Consumer("c-1",queue);
        Thread consumer2 = new Consumer("c-2",queue);
        Thread consumer3 = new Consumer("c-3",queue);

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();

    }
}
