package Entity;

import Entity.imple.FlowerSon;

public class UserDto {

	public  String username;
	public float sex;
	public static int i = 0;
	public int id = i++;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public float getSex() {
		return sex;
	}

	public void setSex(float sex) {
		this.sex = sex;
	}
	
	protected void check() {
		System.out.println("测试protected的访问权限");
	}
	
	public void publicCheck() {
		System.out.println("测试public的访问权限");
		FlowerSon f = new FlowerSon();
		f.rose();
	}
	
	public String getToString(){
		return "id="+id;
	}
	
}
