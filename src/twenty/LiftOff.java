package twenty;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class LiftOff implements Runnable{

	public static int taskCount = 0;
	public int id = taskCount++;
	
	public LiftOff(){
		System.out.println("#"+id+"线程启动");
	}
	
	@Override
	public void run() {
		int priority = Thread.currentThread().getPriority();
		System.out.println("priority="+priority);
		for(int i=0;i<3;i++){
			System.out.println("线程优先级="+priority+",id="+id+",loop="+i+",是否是后台线程="+Thread.currentThread().isDaemon());
//			Thread.yield();
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		throw new RuntimeException();
	}
	
	public static void main(String[] args) {
		try{
			System.out.println("线程优先级="+Thread.currentThread().getPriority()+",是否是后台线程="+Thread.currentThread().isDaemon());
			ExecutorService exec = Executors.newCachedThreadPool(new ThreadFactory() {
				
				@Override
				public Thread newThread(Runnable r) {
					Thread t = new Thread(r);
					t.setPriority(2);
					t.setDaemon(true);
					t.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
						
						@Override
						public void uncaughtException(Thread t, Throwable e) {
							// TODO Auto-generated method stub
							System.out.println("caught="+e+",tgetname="+t.getName());
						}
					});
					return t;
				}
			});
			for(int i =0;i<10;i++){
//				Thread t = new Thread(new LiftOff(),"线程名称="+i);
//				t.setDaemon(true);
//				t.start();
//				LiftOff liftoff = new LiftOff();
//				liftoff.run();
				exec.execute(new LiftOff());
			}
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			exec.shutdown();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
