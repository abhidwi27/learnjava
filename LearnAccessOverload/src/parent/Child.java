package parent;

public class Child extends Parent {
	
	//@Override
	public Integer getChar(Integer n){
		int i = this.c;
		return i;
	}
	
	@Override
	public Number getChar(Number n){
		int i = this.c;
		return i;
	}
	
	/*@Override
	public Number getChar(Integer n){
		int i = this.c;
		return i;
	}*/

}
