package ceshi;

import javax.xml.ws.Action;

import Entity.SimpleStaticTest;

/**
 * 
 * @author Administrator
 *
 */
public class BaseDataTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleStaticTest si = new SimpleStaticTest();
		SimpleStaticTest si2 = new SimpleStaticTest();
		si.bi++;
		SimpleStaticTest.s++;
		System.out.println("si s="+si.s+",bi="+si.bi);
		System.out.println("si2 s="+si2.s+",bi="+si2.bi);
		

		int s3 = 1300;
		Integer s1 = 1300;
		String s2 ="bb";
		String s4 ="bb";
		System.out.println("s2=s1 "+ (s2==s1.toString()));
		System.out.println("s2=s4 "+ (s2==s4));
		System.out.println("s3=s1 "+ (s3 == s1.intValue()));
		System.out.println("s2=s3 "+ (s2==String.valueOf(s3)));
		
		int ss=90;
		System.out.println( ss < 100 ? 92 : 10);
	}
	
	

}
