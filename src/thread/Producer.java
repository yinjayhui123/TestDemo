package thread;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 * @Author: yinhui
 * @Date: 2019/4/28 10:17
 * @Version 1.0
 */
public class Producer extends Thread {

    private String name;
    private BlockingQueue<Integer> queue;
    private int i ;

    public Producer(String name,BlockingQueue<Integer> queue){

        this.name = name;
        this.queue = queue;
    }

    @Override
    public void run(){

        while(true){

            try {
                queue.put(i);
                System.out.println("Producer 【"+name+"】放入value:"+i);
                i++;

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
