package twenty;

public class EvenGenerator extends IntGenerator {

	public int value = 0;

	public static void main(String[] args) {
		EvenChecker.test(new EvenGenerator(), 10);
	}

	@Override
	public int next() {
//		synchronized (EvenChecker.object) {
			value++;
//		Thread.yield();
			value++;
			return value;
//		}
	}

	@Override
	public void serviceMethod(){

		System.out.println("EvenGenerator serviceMethod thread name"+Thread.currentThread().getName()+",start");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("EvenGenerator serviceMethod thread name"+Thread.currentThread().getName()+",end");
	}

}
