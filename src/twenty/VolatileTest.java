/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package twenty;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yinhui
 * @version VolatileTest, v0.1 2018/11/9 14:28
 */
public class VolatileTest {

    public static void main(String[] art){

        VolatileString v = new VolatileString();
        ExecutorService execu = Executors.newCachedThreadPool();
        for(int i =0;i<4 ;i++){
            execu.execute(v);
        }
        execu.shutdown();
    }
}
