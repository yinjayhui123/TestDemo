package eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

public class Gerbil {

	public int gerbilNumber;
	
	public Gerbil(int i) {
		// TODO Auto-generated constructor stub
		gerbilNumber = i;
	}
	
	public void hop(){
		System.out.println("hop gerbile name="+gerbilNumber);
	}
	
	public static void main(String[] str){
		ArrayList<Gerbil> list = new ArrayList<>();
		list.add(new Gerbil(1));
		list.add(new Gerbil(2));
		for (Gerbil gerbil : list) {
			gerbil.hop();
		}
		
		Set<Integer> s = new LinkedHashSet<Integer>();
		for(int i =0 ;i <10;i++){
			s.add(2);
			s.add(i);
		}
		for(Integer ib : s){
			System.out.print(ib+",");
		}
		
		Iterator<Gerbil> it = list.iterator();
		while(it.hasNext()){
			Gerbil g = it.next();
			g.hop();
		}
		
		Queue q = new LinkedBlockingQueue(); 
		
		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(1);
		listInt.add(2);
		listInt.add(3);
		System.out.println("listInt="+listInt);
		
		List<Integer> listIntTwo = new ArrayList(Arrays.asList(4,5,6));
//		listIntTwo.add(1);
//		listIntTwo.add(2);
//		listIntTwo.add(3);
		
		ListIterator<Integer> itInt = listInt.listIterator();
		ListIterator<Integer> itIntTwo = listIntTwo.listIterator(listIntTwo.size());
		while(itInt.hasNext()){
			itInt.next();
		}
		while(itInt.hasPrevious()){
			System.out.println(itInt.previous()+",kk");
		}
		
		while(itIntTwo.hasNext()){
			itIntTwo.next();
			itIntTwo.add(itInt.previous());
		}
		
		for(int i : listIntTwo){
			System.out.println("i="+i);
		}
		
		
	}

}
