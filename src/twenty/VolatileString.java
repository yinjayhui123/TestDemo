/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package twenty;

/**
 * @author yinhui
 * @version VolatileString, v0.1 2018/11/9 14:24
 */
public class VolatileString implements Runnable{

    public boolean flag = true;

    private int count = 0;

    public boolean getVarFlag(){
        return flag;
    }

    public void setVarFlag(boolean f){
        this.flag = f;
    }

    public void flagMethod(){

        try {
            while(flag){
                System.out.println("run thread name="+Thread.currentThread().getName());
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void add(){
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i =0;i<50;i++){
//            count++;
        }
        System.out.println(count);
    }

    @Override
    public void run() {
//        flagMethod();
//        System.out.println("进入run了");
//        while(flag){}
//        System.out.println("线程被停止了！");
        add();
    }
}
