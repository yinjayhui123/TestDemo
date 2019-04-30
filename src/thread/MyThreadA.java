package thread;

/**
 * @Author: yinhui
 * @Date: 2019/4/28 14:00
 * @Version 1.0
 */
public class MyThreadA extends Thread {

    private Myservice myservice;

    public MyThreadA(Myservice myservice){
        this.myservice = myservice;
    }

    @Override
    public void run() {
        for (int i =0 ;i<10;i++){
            myservice.set();
        }
    }

}
