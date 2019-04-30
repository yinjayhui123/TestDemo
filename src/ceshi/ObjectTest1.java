package ceshi;

import java.util.ArrayList;
import java.util.List;

import Entity.Flower;
import Entity.imple.Son;

public class ObjectTest1 {

	public static void main(String[] args) {

		Flower flower = new Flower();
		flower.chrysanthemum();
		Flower.fe.chrysanthemum();
		
		List list = new ArrayList();
		list.isEmpty();
		
		ParentShape parent = new SonCircle();
		SonCircle son = new SonCircle();
		
		parent.triangle();
		parent.square("父类");
		
		son.square("子类");
		son.square("子鹅梨");
		son.triangle();
		
		Son s = new Son();
		s.roses();
	}

}
