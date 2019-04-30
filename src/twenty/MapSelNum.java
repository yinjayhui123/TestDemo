/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package twenty;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author yinhui
 * @version MapSelNum, v0.1 2018/11/8 15:41
 */
public class MapSelNum {

    private Object object = new Object();
//    private  int num = 0;
    public static final  ThreadLocal<Integer> num = new ThreadLocal<>();
    public  void addI(String username,String threadName){
//        synchronized (object){
            if("a".equals(username)){
//                num = 100;
                num.set(100);
                System.out.println("a set over!");

            }else {
//                num = 200;
                num.set(200);
                System.out.println("b set over!");
            }
            System.out.println("addI threadName="+threadName+"-username="+username+",num="+num.get());
//        }
        num.remove();
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            //num.remove();
        }
    }

    public void setMap(String username,String threadName){
        Map<String,String> map = null;
        System.out.println("start");

        synchronized (object) {
            if ("a".equals(username)) {
                map = getMapA();
            } else {
                map = getMapB();
            }
            System.out.println("setMap threadName="+threadName+",username="+username+",rewardType="+map.get("rewardType"));
        }

        System.out.println("end");

//        try {
//            TimeUnit.MILLISECONDS.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    public  Map<String,String>  getMapA(){
        Map<String,String> map = new HashMap<>();
        map.put("rewardType","加息券");
        return map;
    }

    public  Map<String,String> getMapB(){
        Map<String,String> map = new HashMap<>();
        map.put("rewardType","实物");
        return map;
    }
}
