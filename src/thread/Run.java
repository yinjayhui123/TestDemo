package thread;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: yinhui
 * @Date: 2019/4/26 14:58
 * @Version 1.0
 */
public class Run {

    public static void main(String[] str) throws InterruptedException {
        Object object = new Object();

//        ThreadA threadA = new ThreadA(object);
//        Thread thread1 = new Thread(threadA);
//        thread1.start();
//
////        Thread.sleep(2000);
//        ThreadB threadB = new ThreadB(object);
//        Thread thread2 = new Thread(threadB);
//        thread2.start();

        //测试 LinkedBlockingQueue
//        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(1);
//
//        queue.put(1);
//        queue.put(2);
//        int s = queue.take();

        //运行reentrantLock
        Myservice myservice = new Myservice();
        MyThreadA myThreadA = new MyThreadA(myservice);
        myThreadA.start();
        MyThreadB myThreadB = new MyThreadB(myservice);
        myThreadB.start();
    }
}
