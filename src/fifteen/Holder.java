package fifteen;

public class Holder {

	public static void main(String[] str){
		
		System.out.println(threeMethod());
	}
	
	public static ThreeTuple<Integer,String,Double> threeMethod(){
		return new ThreeTuple<Integer,String,Double>(1, "1", 1.00);
	}
}

class TwoTuple<A,B>{
	public final A first;
	public final B second;
	public TwoTuple(A a,B b){
		this.first = a ;
		this.second = b;
	}
}

class ThreeTuple<A,B,C> extends TwoTuple<A,B>{

	public final C third;
	public ThreeTuple(A a, B b, C c) {
		super(a, b);
		// TODO Auto-generated constructor stub
		this.third = c;
	}
	
	public String toString(){
		return "("+first+","+second+","+third+")";
	}
}
