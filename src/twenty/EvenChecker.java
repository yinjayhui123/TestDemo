package twenty;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EvenChecker implements Runnable {

	private IntGenerator gen;
	private final int id;
	public static final Object object = new Object();
	
	public EvenChecker(IntGenerator g,int id){
		this.gen = g;
		this.id = id;
	}
	
	@Override
	public void run() {
		try {
			TimeUnit.MILLISECONDS.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

//		gen.serviceMethod();

		synchronized (object){

			while(!gen.isCanceled()){
				int val = gen.next();
//			System.out.println("val="+val+",id="+id);
				if(val % 2 == 0 ){
					System.out.println("val="+val+" not even!"+",id="+id);
					gen.cancel();
				}
			}
		}

	}
	
	public static void test(IntGenerator g,int count){
		ExecutorService exec = Executors.newCachedThreadPool();
		List<EvenChecker> list = new ArrayList<EvenChecker>();
		EvenChecker v = null;
		for(int i =0 ;i<count;i++){
//			v = new EvenChecker(g, i);
//			list.add(v);
			exec.execute(new EvenChecker(g, i));
		}
		exec.shutdown();
	}

}
