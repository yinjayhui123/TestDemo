/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package twenty;

/**
 * @author yinhui
 * @version VarTest, v0.1 2018/11/9 17:54
 */
public class VarTest {

    public static String sex;  //--类变量
    public String name = "历史"; //--实例变量
    public final int AGE = 0;  //--常量

    public void methodUser(){
        String weight = "180G";// --方法变量
        final int height = 180;//--常量
    }
}
