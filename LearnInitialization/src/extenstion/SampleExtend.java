package extenstion;

public class SampleExtend {
	
	public void test(){
		System.out.println("Printing test from Class C ");
	}

}

class B extends SampleExtend{
	@Override
	public void test(){
		super.test();
	}
}

class A extends B{
	
	public static void main(String[] args) {
		A a = new A();
		//boolean b = false;
		//Boolean b1 = new Boolean(b1);
		a.test();
		String str1="abc";
	      String str2="def";
	      String str3=str1.concat(str2);
	      String d = "abc";
	      
	      try{
	    	  //return;
	    	  
	      }finally{
	    	  System.out.println("Finally");
	      }
	      int index = 1;
	      Boolean [] test = new Boolean[3];
	      Boolean data = test[index];
	      System.out.println("data " + data);
	      /*str1.concat(str2);
	      System.out.println(str1);
	      
	      int i[] = {1};
		     change_i(i);
		     System.out.println(i[0]);
		     
		     for(int k=0; k<=i.length-1 ; k++) {
		    	 System.out.println("i[" + k + "]="+ i[k]);
		     }*/
	      
	}
	
	public static void change_i(int i[]) 
	{
	     int j[] = {2};
	     i = j;
	     System.out.println("printing i inside change i method" + i[0]);
	}
	
	@Override
	public void test(){
		super.test();
		System.out.println("Printing test from Class A ");
	}
	
	class returnData	{
	Short getData(byte a, double z)
	{
	return (short) (a/z * 10);
	}
	}
}
