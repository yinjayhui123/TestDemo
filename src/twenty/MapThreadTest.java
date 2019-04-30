/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package twenty;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yinhui
 * @version MapThreadTest, v0.1 2018/11/9 10:13
 */
public class MapThreadTest {

    public static void main(String[] args) {
        String username = null;
        MapSelNum mapSelNum = new MapSelNum();
        ExecutorService execu = Executors.newCachedThreadPool();
        for(int i =0;i<9 ;i++){
            username = i % 2 == 0 ? "b":"a";
//            execu.execute(new MapRunnable(mapSelNum,username,i));
//            try {
//                Thread.sleep(600);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            execu.execute(new MapRunnableTwo(mapSelNum,username,i));
        }

        Integer s = MapSelNum.num.get();
        System.out.println(s);

        execu.shutdown();


    }
}
