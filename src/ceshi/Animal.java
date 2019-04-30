package ceshi;

import Entity.Flower;
import Entity.imple.FlowerSon;


public class Animal{
	public int sum=2;
	public Flower fe = new FlowerSon();
	
	private  void run(){
		System.out.println("动物走");
	}
	
	public static void cry(){
		System.out.println("动物叫");
	}
	
	public  void fugai(){
		fe.chrysanthemum();
	}
	
	public static void main(String[] args) {
		Animal a = new Bird();
		System.out.println(a.sum);
		a.run();
		a.cry();
		a.fugai();
	}
}

class Bird extends Animal{
	public  FlowerSon fe = new FlowerSon();
	
	public int sum=2;
	
	public void run(){
		System.out.println("鸟走");
	}
	
	public static void cry(){
		System.out.println("鸟叫");
	}
	
	public  void fugai(){
		fe.sFinal();
	}
}