package nineteen;

import Entity.UserDto;
import nineteen.Food.Coffee;

import java.lang.ref.WeakReference;

public class TypeOfFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDto dto = new UserDto();
		WeakReference<UserDto> userDto = new WeakReference<UserDto>(dto);


		dto.setUsername("sdf");
		dto= null;
		System.gc();
		if(userDto.get() != null){
			System.out.println("WeakReference 未被清除");
		}else{
			System.out.println("WeakReference 已清除");
		}

		Food food = Coffee.LATTE;
		System.out.println(food);
	}
	
	public void execute(){
		System.out.println("Execute....");
		
	}
	
	@Test void testExecute(){
		execute();
	}

}
