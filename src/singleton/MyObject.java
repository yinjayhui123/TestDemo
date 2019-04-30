package singleton;

/**
 * 单例
 * @Author: yinhui
 * @Date: 2019/4/29 9:38
 * @Version 1.0
 */
public class MyObject {
//    //立即加载单例-- 饿汉模式
//    private static MyObject myObject = new MyObject();
//
//    public static MyObject getInstance(){
//        try {
//            //模拟在创建对象之前处理其他事物
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return myObject;
//    }

    //延迟加载单例-- 懒汉模式
    private volatile static MyObject myObject = null;

    //DCL(Double-Check Locking) 双检查锁机制 ,实现多线程环境下的延迟加载单例设计模式
    public static MyObject getInstance(){
        if(myObject == null){
            //模拟在创建对象之前处理其他事物
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (MyObject.class){
                if(myObject == null){
                    myObject = new MyObject();
                }
            }
        }
        return myObject;
    }
}
