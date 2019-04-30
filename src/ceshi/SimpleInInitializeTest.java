package ceshi;

import Entity.SimpleInInitializeDto;

public class SimpleInInitializeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleInInitializeDto dto = new SimpleInInitializeDto();
		System.out.println("integer si="+dto.si);
		System.out.println("char sc="+dto.sc);
		System.out.println("dto="+dto);
		
		System.out.println("boolean a=="+dto.a);
		System.out.println("char b=="+dto.b);
		System.out.println("byte c=="+dto.c);
		System.out.println("short d=="+dto.d);
		System.out.println("int e=="+dto.e);
		System.out.println("long f=="+dto.f);
		System.out.println("float g=="+dto.g);
		System.out.println("double h=="+dto.h);
	}

}
