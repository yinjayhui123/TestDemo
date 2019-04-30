package twenty;

public abstract class IntGenerator {
	
//	private volatile boolean canceled = false;
	private  boolean canceled = false;
	
	public abstract int next();
	
	public  void cancel(){
		System.out.println("IntGenerator cancel thread name"+Thread.currentThread().getName());
		canceled = true;
	}

	public  boolean isCanceled(){
		return canceled;
	}

	synchronized public void serviceMethod(){
		System.out.println("IntGenerator serviceMethod thread name"+Thread.currentThread().getName()+",start");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("IntGenerator serviceMethod thread name"+Thread.currentThread().getName()+",end");
	}

}
