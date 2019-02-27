package LearnString;

import java.io.UnsupportedEncodingException;

public class StringEx {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "World";
		String s3 = "Example";
		
		CharSequence c = "ello";
		String s4  = "ello";
		String s5 = new String("Hello");
		StringBuilder s6  = new StringBuilder();
		s6.append("Hello");
		
		
		/*System.out.println(s1.charAt(0));
		System.out.println(s1.codePointAt(2));
		System.out.println(s1.codePointBefore(3));
		System.out.println(s1.codePointCount(2, 4));
		System.out.println(s1.compareTo("Hello"));
		System.out.println(s1.compareToIgnoreCase("hello"));
		System.out.println(s1.concat("adding one more string"));
		System.out.println(s1);
		System.out.println(s1.contains(s4));
		System.out.println(s1.contentEquals(s5));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s6));
		
		char[] ch = {'a', 'b', 'a', 'c', 'd'};
		String s7 = String.copyValueOf(ch);
		System.out.println(s7);
		System.out.println(String.copyValueOf(ch, 1, 4));
		System.out.println(s1.endsWith("Ello"));
		System.out.println(s1.equalsIgnoreCase("hello"));
		System.out.println(String.format("%.8f", 47.34));
		byte b1[] = s1.getBytes();
		for (byte b: b1){
			System.out.println(b);
		}
		
		
		byte b2[];
		try {
			b2 = s1.getBytes("US-ASCII");
			for (byte b: b2){
				System.out.println(b);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		byte b3[];
		try {
			b3 = s1.getBytes("UTF-16");
			System.out.println("Printing UTF 16...");
			for (byte b: b3){
				System.out.println(b);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*char ch2[] = new char[10];
		s3.getChars(1,4 , ch2, 2);
		for(char c1 : ch2){
			System.out.println(c1);
		}*/
		//System.out.println(s1.hashCode());
		//System.out.println(s5.hashCode());
		
		//System.out.println(s1.indexOf('l'));
		/*System.out.println(s1.indexOf('l',5));
		
		String s9 = "intern";
		String s10 = "hello".intern();
		System.out.println(s10);
		
		System.out.println(String.join("-", "Java", "is", "cool"));
		
		CharSequence c5 = "xam";
		System.out.println(s3.replace(c5,"iio"));*/
		
		String s11 = "My-Name-is-Khan";
		
		/*String s12[] = s11.split("-");
		
		for(String s13: s12){
			System.out.println(s13);
		}*/
		
		/*String s14[] = s11.split("-", 2);
		for(String s15: s14){
			System.out.println(s15);
		}*/
		
		//System.out.println(s11.substring(2));
		
		/*System.out.println(s11.substring(2, 6));
		
		System.out.println(s11.subSequence(2, 6));*/
		
		/*char[] c18 = s11.toCharArray();
		for(char c19 : c18){
			System.out.println(c19);
		}*/
		
		/*System.out.println(s11.toLowerCase());
		System.out.println(s11.toUpperCase());*/
		
		/*String s15 = "  my name is kunda   1";
		System.out.println(s15);
		System.out.println(s15.trim());*/
		boolean b = false;
		System.out.println("false".equals(String.valueOf(b)));
	}
	

}
