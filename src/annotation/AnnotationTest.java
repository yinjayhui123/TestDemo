package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author: yinhui
 * @Date: 2018/12/25 16:25
 * @Version 1.0
 */
public class AnnotationTest {

    public static void main(String[] str){
        A a = new A();
        System.out.println("返回此元素上存在的所有注解:"+Arrays.toString(a.getClass().getAnnotations()));
        System.out.println("该元素如果存在指定类型的注解，则返回这些注解，否则返回 null:"+a.getClass().getAnnotation(MyLog1.class));
        System.out.println("获得当前类的所以字段:"+Arrays.toString(a.getClass().getDeclaredFields()));
        Field[] fields = a.getClass().getDeclaredFields();
        Annotation[] an = fields[0].getDeclaredAnnotations();
        MyLog2 myLog2s = (MyLog2)an[0];
        System.out.println("获得当前类的所以字段:"+Arrays.toString(fields[0].getDeclaredAnnotations()));
        System.out.println("myLog2s的value："+myLog2s.name());

        Method[] methods = a.getClass().getMethods();
        for(int i = 0;i < methods.length ;i++){

            System.out.println("A类中的方法："+Arrays.toString(methods[i].getAnnotations()));
        }


        Class<?> clazz = A.class;
        MyLog1 myLog1 = clazz.getAnnotation(MyLog1.class);
        String value = myLog1.value();
        System.out.println("从注解中获得到的值："+value);


    }
}
