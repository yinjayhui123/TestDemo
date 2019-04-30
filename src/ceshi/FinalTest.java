package ceshi;

import nine.Rodent;
import nine.WindInterface;
import Entity.Flower;
import Entity.UserDto;
import Entity.imple.FlowerSon;
import Entity.imple.Son;

public class FinalTest {

	static  Son U = new Son();
	final UserDto f = new UserDto();
	
	public static int sb;  
	
	static {
		System.out.println("stat");
	}
	
	public FinalTest(int s){
		this.sb = s;
	}
	
	public static void main(String[] args) {
		System.out.println("我是");
		FinalTest one = new FinalTest(2);
		FinalTest two = new FinalTest(3);
		
//		 one.setTo();
//		 two.setTo();
		
		Flower f = new FlowerSon();
		 
		 System.out.println(one.sb +","+two.sb);
		 
		 
	}
	
	public  void setTo(final UserDto bx,final int bs){
		bx.setUsername("sdf");
//		System.out.println("static final UserDto ="+U.getToString()+",final UserDto="+f.getToString());
		
	}
	
    public static int   method() {  
        System.out.println("=====method========");  
        return 0;  
    }

}
