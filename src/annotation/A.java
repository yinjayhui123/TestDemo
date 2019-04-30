package annotation;

/**
 * @Author: yinhui
 * @Date: 2018/12/25 16:24
 * @Version 1.0
 */
@MyLog1("我是谁")
public class A {

    @MyLog2(name="姓名")
    public String name;
    private int sex;


    public void st(@MyLog2(name="入参")String values){
        String value = "23";
    }
}
