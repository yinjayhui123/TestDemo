package ceshi;

 abstract class ParentShape {

	 private String parentCirlce="parentCirlce";
	 public String parentSquare="parentSquare";
	 protected String parentTriangle="parentTriangle";
	 
	 
	public ParentShape(){
		System.out.println("父类被调用");
	}
	 
	private void circle(){
		System.out.println("我是圆形");
	}
	
	public void square(String names){
		System.out.println("是我正方形="+names);
	}
	
	protected void triangle(){
		System.out.println("我是三角形");
	}
}
