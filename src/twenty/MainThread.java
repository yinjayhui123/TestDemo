package twenty;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		
		for(int i=0;i<10;i++){
			results.add(exec.submit(new TaskWithResult(i)));
		}
		
		for(Future<String> fs :results){
			try{
				boolean flag = fs.isDone();
				System.out.println("flag="+flag+","+fs.get());
			}catch(Exception e){
				
			}finally{
				exec.shutdown();
			}
			
		}
		int v = 1%2;
		System.out.println(v);
	}

}
