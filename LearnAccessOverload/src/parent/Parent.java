package parent;

import java.io.IOException;

public class Parent {
	
	protected Character c = 'a';
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/*public Character getChar(){
		return this.c;
	}*/
	
	protected Number getChar(Number n) throws IOException{
		
		int i = this.c;
		if(!( c instanceof Character )){
			throw new IOException("myexception");
		}else{
			return i;
		}
		
	}
}
