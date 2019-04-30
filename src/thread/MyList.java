package thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yinhui
 * @Date: 2019/4/26 14:50
 * @Version 1.0
 */
public class MyList {

    private static List list = new ArrayList();

    public static void add(){
        list.add("sdf");
    }

    public static int get(){
        return list.size();
    }
}
