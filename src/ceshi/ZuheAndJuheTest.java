package ceshi;

import Entity.Flower;
import Entity.UserDto;
import Entity.imple.FlowerSon;

public class ZuheAndJuheTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flower f = new FlowerSon();
		f.chrysanthemum();
		f.statMethod();
		
		Zuhe z = new Zuhe();
		z = null;
		System.gc();
		Zuhe.choose();
		
		Juhe j = new Juhe();
		j= null;
		System.gc();
		j.choose();
		
	}

}

//组合
class Zuhe{
	public static UserDto dto = new UserDto();
	
	public static void choose(){
		dto.publicCheck();
	}
}

class Juhe{
	public UserDto d ;
	private String b;
	
	public void choose(){
		if(d == null){
			d = new UserDto();
			d.publicCheck();
		}
	}
}
