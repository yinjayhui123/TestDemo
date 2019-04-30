package thread;

import java.util.concurrent.BlockingQueue;

/**
 * @Author: yinhui
 * @Date: 2019/4/28 10:27
 * @Version 1.0
 */
public class Consumer extends Thread {

    private String name;
    private BlockingQueue<Integer> queue;

    public Consumer(String name,BlockingQueue<Integer> queue){

        this.name = name;
        this.queue = queue;
    }

    @Override
    public void run(){

        while(true){

            try {
                int i = queue.take();
                System.out.println("Consumer 【"+name+"】消费value:"+i);

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
