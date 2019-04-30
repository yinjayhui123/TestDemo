package thread;

/**
 * @Author: yinhui
 * @Date: 2019/4/26 14:56
 * @Version 1.0
 */
public class ThreadB implements Runnable {
    private Object object;

    public ThreadB(Object object){
        this.object = object;
    }

    @Override
    public void run() {

        synchronized (object){

            for(int i = 0;i<10;i++){
                MyList.add();
                if(MyList.get() == 5){
                    object.notify();
                    System.out.println("已发送通知！");
                }
                System.out.println("list 已添加"+i+"个元素");
            }
        }

    }
}
