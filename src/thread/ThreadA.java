package thread;

/**
 * @Author: yinhui
 * @Date: 2019/4/26 14:52
 * @Version 1.0
 */
public class ThreadA implements Runnable{

    private Object object;

    public ThreadA(Object object){
        this.object = object;
    }

    @Override
    public void run() {

        try {
            synchronized (object){
                System.out.println("wait start");
                object.wait();
                System.out.println("wait end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
