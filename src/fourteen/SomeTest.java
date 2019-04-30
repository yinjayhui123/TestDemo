package fourteen;

import java.lang.reflect.Proxy;

import nine.Cycle;

public class SomeTest {

	public static void main(String[] arg){
		
		Cycle cy = (Cycle)Proxy.newProxyInstance(Cycle.class.getClassLoader(), new Class[]{Cycle.class}, new FirdHandler(new SomeMethods()));
		cy.run();
	}

}
