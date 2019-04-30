package nineteen;

import static nineteen.EnumClass.*;

import java.lang.reflect.Method;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value = HOT.getDsecrip();
//		System.out.println(value);
		
		for(EnumClass ec : EnumClass.values()){
			System.out.println("ec:"+ec);
			System.out.println(ec.name());
		}
		
		EnumClass color = MILD;
		
		EnumClass[] es = EnumClass.values();
		Enum e = EnumClass.HOT;
		int va = e.compareTo(EnumClass.NOT);
		System.out.println("va="+va);
		
		for(Enum en : e.getClass().getEnumConstants()){
			System.out.println(en.ordinal());
		}
		EnumClass clss = HOT;
		switch (clss) {
		case HOT:
			
			break;

		case MILD:
			
			break;
		default:
			break;
		}

	}

}
