package nineteen;

public enum EnumClass{
	
	NOT("Miss Gulch"),
	MILD("Good by"),
	HOT("hot");
	
	private String dsecrip;
	private EnumClass(String dsecrip){
		this.dsecrip = dsecrip;
	}
	public String getDsecrip() {
		return dsecrip;
	}
	public void setDsecrip(String dsecrip) {
		this.dsecrip = dsecrip;
	}
	
	public static String getValue(String des){
		for(EnumClass ec : EnumClass.values()){
			if(des.equals(ec.getDsecrip())){
				return ec.getDsecrip();
			}
		}
		return null;
	}
	
	public String toString(){
		String id = name();
		String value = id.substring(1);
		String lower = value.toLowerCase();
		
		return id.charAt(0)+lower;
	}
	
}
