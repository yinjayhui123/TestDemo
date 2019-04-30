/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package twenty;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

/**
 * @author yinhui
 * @version ListRunnable, v0.1 2018/11/15 17:11
 */
public class ListRunnable implements Runnable {

    private static List<Integer> list = null;
    private static CountDownLatch countDownLatch = new CountDownLatch(1500);

    @Override
    public void run() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int i =0;i<10;i++){
            list.add(i);
        }
        System.out.println("线程" + Thread.currentThread().getId() + "已到达终点");

        //完成一个子线程
        countDownLatch.countDown();
    }

    public static void main(String[] str){
        ListRunnable listRunnable = new ListRunnable();
//        list = new ArrayList<>();// 容易产生数组越界
//        list = new Vector<>();
        list = new CopyOnWriteArrayList<>();

        for(int i=0;i<1500;i++){
            Thread thread = new Thread(listRunnable);
            thread.start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // List的size
        System.out.println(list.size()+"-----------------------");
    }
}
