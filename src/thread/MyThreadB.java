package thread;

/**
 * @Author: yinhui
 * @Date: 2019/4/28 14:02
 * @Version 1.0
 */
public class MyThreadB extends Thread {

    private Myservice myservice;

    public MyThreadB(Myservice myservice){
        this.myservice = myservice;
    }

    @Override
    public void run() {
        for (int i =0 ;i<10;i++){
            myservice.get();
        }
    }
}
