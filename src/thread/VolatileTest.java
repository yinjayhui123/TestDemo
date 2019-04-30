package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @Author: yinhui
 * @Date: 2019/4/30 10:34
 * @Version 1.0
 */
public class VolatileTest {

    private static AtomicInteger race = new AtomicInteger(0);

    private static void increase(){
        race.getAndIncrement();
    }

    public static void main(String[] str){

        Thread[] thread = new Thread[20];
        for(int i = 0;i < thread.length;i++){
            thread[i] = new Thread(new Runnable() {
                @Override
                public void run() {

                    for(int s =0 ;s<1000;s++){
                        increase();
                    }
                }
            });
            thread[i].start();
        }

//        System.out.println(Thread.activeCount());
        //Java多线程，判断其他线程是否结束的方法 : Thread.activeCount() == 1
        while(Thread.activeCount() > 1){
            Thread.currentThread().getThreadGroup().list();
            Thread.yield();
        }

        System.out.println("race="+race.get());

//        ExecutorService exe = Executors.newFixedThreadPool(20000);
//        for(int j=0;j<20000;j++){
//            exe.execute(new Runnable() {
//                @Override
//                public void run() {
//
//                    for(int s =0 ;s<1000;s++){
//                        increase();
//                    }
//                }
//            });
//        }
//        exe.shutdown();
//        while(true){
//            if(exe.isTerminated()){
//                System.out.println("所有线程都已经执行完毕");
//                break;
//            }
//        }
//        System.out.println("race="+race.get());

    }


    public void setRace(){
//        AtomicStampedReference stampedReference = new AtomicStampedReference();
    }
}
