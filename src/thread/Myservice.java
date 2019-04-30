package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: yinhui
 * @Date: 2019/4/28 13:49
 * @Version 1.0
 */
public class Myservice {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    /**
     * 生产
     */
    public void set(){

        try{
            lock.lock();
            System.out.println("set begin="+System.currentTimeMillis());
            while(hasValue == true){
                System.out.println("set await="+System.currentTimeMillis());
                condition.await();
            }
            System.out.println("打印❤❤");
            hasValue = true;
            condition.signal();

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally{
            lock.unlock();
        }

    }

    /**
     * 消费
     */
    public void get(){

        try {
            lock.lock();
            System.out.println("get begin="+System.currentTimeMillis());
            while (hasValue == false){
                System.out.println("get await="+System.currentTimeMillis());
                condition.await();
            }
            System.out.println("打印♡♡");
            hasValue = false;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

}
