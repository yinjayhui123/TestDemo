package fifteen;

public class LinkedStack5<T> {
	private class Node{
		private T item = null;
		private Node next = null;
		
		Node(){
			this.item = null;
			this.next = null;
		}
		Node(T t,Node n){
			this.item = t;
			this.next = n;
		}
		
		boolean end(){
			return item == null && next == null;
		}
	}
	
	private Node top = new Node();
	public void push(T t){
		top = new Node(t,top);
	}
	
	public T pop(){
		
		T result = top.item;
		if(!top.end()){
			top = top.next;
		}
		return result;
	}

	public static void main(String[] args) {

		LinkedStack5<String> li = new LinkedStack5<String>();
		for(String s : "w,s".split(",")){
			li.push(s);
		}
		
		String str = null ;
//		for(int i=0;i<3;i++){
//			str = li.pop();
//			System.out.println(str);
//		}
		
		while((str = li.pop()) != null){
			System.out.println(str);
		}
	}

}
