package ten;

import nine.Cycle;

public class Outer {

	private int next = 0;
	private String ob;
	
	public Outer(String ob){
		this.ob = ob;
	}
	
	protected class Inner {
		private String username="Yin hui";
		
		public String endTo(){
			return ob.toString();
		}
	}
	
	private class BWN implements Cycle{

		@Override
		public void run() {
			System.out.println("宝马在跑=");
		}
		
		public int updateNext(int bs){
			return next = bs;
		}
		
	}
	
	public Cycle getCycle(){
		Cycle c = new BWN();
		return c;
	}
	
	public Inner getInner(){
		return new Inner();
	}
	
	//局部内部类
	public Cycle iner(){
		class MB implements Cycle{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("我是膜拜");
			}
		}
		return new MB();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer("w");
		Outer.Inner i = o.getInner();
		System.out.println( i.endTo());
		
		Outer.Inner oi = o.new Inner();
		System.out.println( oi.username);
	}

}
