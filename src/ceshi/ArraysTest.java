package ceshi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArraysTest {

	static void printArray(Object... ob){
		for(Object obs: ob){
			System.out.println("obs="+obs);
		}
	}
	static void printArrayTwo(Integer... ob){
			System.out.println("int class="+ob);
	}
	
	static void printArrayTwo(String b,Integer... ob){
		System.out.println("int class="+ob);
}
	
	public static void main(String... args) {
		// TODO Auto-generated method stub
		printArrayTwo(1);
		printArray();
		printArray((Object[])new Integer[]{1,2,3,4});
		
		Random ra = new Random();
		ArraysTrees[] ar = new ArraysTrees[2];
		System.out.println("ceshi ar="+ar);
		for(int b =0;b<ar.length;b++){
			
			ar[b] = new ArraysTrees("因慧"+b);
		}
		
		List<ArraysTrees> list = new ArrayList<ArraysTrees>();
		for(int u=0;u<ar.length;u++){
			list.add(new ArraysTrees("蒲公英"+u));
		}
		System.out.println("list tostring="+list.toString());
}
}

class ArraysTrees{
	
	public ArraysTrees(String s){
		System.out.println("Tree构造器接受到的String参数="+s);
	}
}

