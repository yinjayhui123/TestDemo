package eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> listIntTwo = new LinkedList<Integer>(Arrays.asList(4,5,6));
		System.out.println(listIntTwo.peek()+","+listIntTwo.pop());
		
		listIntTwo.push(7);
		listIntTwo.push(8);
		listIntTwo.addFirst(9);
		listIntTwo.addLast(10);
		listIntTwo.iterator();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		HashSet<Integer> h = new HashSet<Integer>();
		h.addAll(listIntTwo);
		
		Stack<Integer> st = new Stack<Integer>();
		
		Iterator<Integer> l = list.iterator();
		listIntTwo.iterator();
		
		for(Integer i :listIntTwo){
			System.out.print(",i="+i);
		}
		
		
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		for(String s :"A B C D E F".split("")){
			pq.offer(s);
		}
		System.out.println("pq"+pq);
	}

}
