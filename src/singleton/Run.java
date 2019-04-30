package singleton;

import sun.misc.Unsafe;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: yinhui
 * @Date: 2019/4/29 9:40
 * @Version 1.0
 */
public class Run {
//    private static final Unsafe unsafe = Unsafe.getUnsafe();

//    private AtomicInteger is ;
//
//    //下述变量value在AtomicInteger实例对象内的内存偏移量
//    private static final long valueOffset;
//
//    static {
//        try {
//            //通过unsafe类的objectFieldOffset()方法，获取value变量在对象内存中的偏移
//            //通过该偏移量valueOffset，unsafe类的内部方法可以获取到变量value对其进行取值或赋值操作
//            valueOffset = unsafe.objectFieldOffset
//                    (Run.class.getDeclaredField("value"));
//        } catch (Exception ex) {
//            throw new Error(ex);
//        }
//    }
//    private volatile int value;


    public static void main(String[] str){

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        MyThread thread4 = new MyThread();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Integer s = 131;
        Integer s2 = 131;
        int b = 131;
        int b2 = 131;
        System.out.println(s == s2);
        System.out.println(b == b2);

        ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();
        map.put("","");
        map.get("");

        int i = 0;
        do{

            System.out.println(i++);
        }while(i != 3);
    }

//    public boolean cas(){
//        return unsafe.compareAndSwapInt(this,valueOffset,0,1);
//    }
}
