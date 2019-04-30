package fifteen;

import Entity.UserDto;

public class CeshiTest<T> {
	
	private Leibu leibbu = new Leibu();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CeshiTest<String> dto = new CeshiTest<String>();
		for(String s : "w,s,r".split(",")){
			dto.setB(s);
		}
		
		StringBuffer s =new StringBuffer();
		StringBuilder bs = new StringBuilder();
		
		for(int i=0;i <3;i++){
			System.out.println(dto.getB());
		}
	}
	
	public void setB(T name){
		leibbu = new Leibu(name,leibbu);
	}

	public T getB(){
		T b =leibbu.name;
		leibbu = leibbu.l;
		return b ;
	}

	class Leibu{
		public T name;
		public Leibu l;
		public Leibu(){
			name = null;
			l = null;
		}
		
		public Leibu(T b,Leibu l){
			this.name = b;
			this.l = l;
		}
		
		
	}
//	private class Node{
//		private T item = null;
//		private Node next = null;
//		
//		Node(){
//			this.item = null;
//			this.next = null;
//		}
//		Node(T t,Node n){
//			this.item = t;
//			this.next = n;
//		}
//		
////		boolean end(){
////			return item == null && next == null;
////		}
//	}
//	
//	private Node top = new Node();
//	public void pushB(T t){
//		top = new Node(t,top);
//	}
//	
//	public T popB(){
//		
//		T result = top.item;
////		if(!top.end()){
//			top = top.next;
////		}
//		return result;
//	}
}


