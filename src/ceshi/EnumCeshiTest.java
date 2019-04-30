package ceshi;

import Entity.EnumMoney;

public class EnumCeshiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(EnumMoney e: EnumMoney.values()){
			System.out.println(e+",ordinal "+e.ordinal());
		}
	}

}
