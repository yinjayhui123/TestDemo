package nine;

import ten.Test9;

public abstract class Rodent implements Instrument{

	public abstract void run();
	
	public Rodent(){
		run();
	}
	
	 void play(){
		System.out.println();
	}
}

class RodentSon extends Rodent{
	private int i =10;

	@Override
	public void run() {
		System.out.println("run="+i);
		 new Test9(){
            int number =3;
            public int getNumber(){
                return number;
            }
        }; 
	}

	@Override
	public String runs() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
