package ten;

import nine.Cycle;
import ceshi.OuterSon;

public class TenTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer o = new Outer("www");
		Outer.Inner i = o.new Inner();
		System.out.println(i.endTo());
		
		OuterSon ou = new OuterSon("nb");
//		int b = ou.getBWN().updateNext(12);
//		System.out.println(b);
		

		Outer bs = new Outer("f");
		Cycle c = bs.getCycle();
		c.run();
		
		 Test9 t = new Test9();
	        listner l = t.setOnClickListner();
	        Cycle cy = t.getCycle();
	        cy.run();
	        
//	    Test9.onClickListner ls = t.new onClickListner();
	        Test9.onClickListner ls = new Test9.onClickListner();
	        ls.doclick();
		
	}

}
