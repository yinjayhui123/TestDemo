package ten;

import nine.Cycle;

public class Test9 {
	
	public Test9(){
		System.out.println("我是外围类 Test9");
	}
	

	 public static class onClickListner implements listner,Cycle{
		 public onClickListner(){
			 System.out.println("我是静态内部类 onClickListner");
		 }
		 
	        @Override
	        public void doclick() {
	            System.out.println("click");
	        }
	        public void doOther(){
	            System.out.println("other");
	        }
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("我㛑不知道");
			}
	    }
	    public listner setOnClickListner(){
	        listner l = new onClickListner();
	        return l;
	    }
	    public Cycle getCycle(){
	    	Cycle c = new onClickListner();
	    	return c;
	    }
	    
	    //局部内部类
	    public void jubulei(){
	    	 class Jubuson{
	    		 public Jubuson(){}
	    		 
	    		 
	    		String getSlip(){
	    			return "woshi";
	    		}
	    	}
	    	 Jubuson j = new Jubuson();
	    }
	    
//	    public Destination getWoman(final String names){
//	    	return new  Woman(){
//	    		
//	    		private void con() {
//					// TODO Auto-generated method stub
//	    			System.out.println(names);
//				}
//	    	};
	    	
//	    	return new Destination(){
//	            int number =3;
//	            public int getNumber(){
//	                return number;
//	            }
//	        }; 
//	    }
	    
	    public static void main(String[] args){
	        Test9 t = new Test9();
//	        listner l = t.setOnClickListner();
//	        l.doOther();//编译器报错，cannot resolve method。
	    }

}
