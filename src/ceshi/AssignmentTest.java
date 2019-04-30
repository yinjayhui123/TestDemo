package ceshi;

import Entity.UserDto;

/**
 * java 别名机制
 * @author Administrator
 *
 */
public class AssignmentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDto user1 = new UserDto();
		UserDto user2 = new UserDto();
		
		user1.setUsername("银行");
		user2.setUsername("外面");
		
		System.out.println("1:user1.getUsername="+user1.getUsername()
				+",user2.getUsername="+user2.getUsername());
		
		//user2 赋给 user1，那user2和user1就是同一个对象引用了。user1原本的引用被垃圾回收了
		user1 = user2;
		System.out.println("2:user1.getUsername="+user1.getUsername()
				+",user2.getUsername="+user2.getUsername());
		
		user1.setUsername("银灰");
		//3:user1.getUsername=银灰,user2.getUsername=银灰
		System.out.println("3:user1.getUsername="+user1.getUsername()
				+",user2.getUsername="+user2.getUsername());
	
		user1.setSex(2);
		System.out.println("1: user1.getSex="+user1.getSex());
		
		setfloat(user1);
		System.out.println("2: user1.getSex="+user1.getSex());
	}
	
	public static void setfloat(UserDto user1){
//		UserDto user2 = new UserDto();
//		user2.setSex(221);
//		user1 = user2;
		
		UserDto user2 = user1;
		user2.setSex(221);
		
	}

}
