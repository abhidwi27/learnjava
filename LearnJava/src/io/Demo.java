package io;

public class Demo 
{ 
	static int i = 12;
    public static void main(String[] args) 
    { 
       // Integer i = new Integer(12); 
    	
        System.out.println(i); 
        //System.out.println("hashcode before calling modify " + i.hashCode());
      modify(i); 
        //System.out.println("hashcode after calling modify " + i.hashCode());
        System.out.println(i); 
    } 
  
    private static void modify(int i) 
    { 
    	//System.out.println("hashcode before addtion in modify " + i.hashCode());
        i = i + 1; 
       // System.out.println("hashcode after addtion in modify " + i.hashCode());
        //return i;
    } 
}
