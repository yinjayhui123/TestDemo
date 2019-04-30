package twelve;

import ten.Outer;

public class LogginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer ou = null;
		try{
			throw new MyException("这私有的");
//			ou.getInner();
		}catch(Exception e){
			e.printStackTrace();
//			e.show();
		}finally{
			System.out.println("wo finally");
		}
	}

}
