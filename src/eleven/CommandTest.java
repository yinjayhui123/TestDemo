package eleven;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


public class CommandTest{
	
	public static void main(String[] args) {
		
		CommandQueue l1 = new CommandQueue();
		l1.setQueu(new Command("我"));
		l1.setQueu(new Command("是"));
		l1.setQueu(new Command("谁"));
		l1.setQueu(new Command("大"));
		l1.setQueu(new Command("人"));
		
		Queue<Command> q = l1.getQuer();
		
		while(q.peek() != null){
			Command c = q.remove();
			c.operation();
		}
		
		HashMap<String, String> strmap = new HashMap<String, String>();
		Iterator set = strmap.entrySet().iterator();
		strmap.put("yin", "hhui");
		strmap.put("gao", "ling");
		System.out.println(strmap.values());
		
	}
}


 class Command {

	public String name;
	
	public Command(String name){
		this.name = name;
	}
	
	public void operation(){
		System.out.println("operName="+name);
	}
	
}

class CommandQueue{
	public Queue<Command> q = new LinkedList<Command>();
	
	public void setQueu(Command c){
		
		q.offer(c);
	}
	
	public Queue<Command> getQuer(){
		return q;
	}
}
