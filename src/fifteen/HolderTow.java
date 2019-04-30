package fifteen;

public class HolderTow<T> {

	private T a;
	public HolderTow(){}
	
	public void setT(T b){
		this.a = b;
	}
	
	public T getT(){
		return a;
	}
	
	public static void main(String[] str){
		HolderTow hd = new HolderTow();
		hd.setT("我是");
		System.out.println(hd.getT());
		
		HolderTow<Integer> hi = new HolderTow<Integer>();
		hi.setT(12);
		System.out.println(hi.getT());
	}

}
