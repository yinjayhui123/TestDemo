package nine;

import ceshi.WindSon;

public class NineTest extends Rodent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new RodentSon().run();
		Rodent r = new RodentSon();
		
		WindInterface w = new WindSon();

		System.out.println(WindInterface.i);
	}

	@Override
	public String runs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
