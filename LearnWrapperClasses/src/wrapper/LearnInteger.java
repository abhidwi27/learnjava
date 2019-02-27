package wrapper;

public class LearnInteger {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		String s  = "10";
		Integer j = 24792749;
		Integer in = new Integer(10);
		/*System.out.println(in.equals(i));
		System.out.println(in.hashCode());
		System.out.println(Integer.bitCount(i));*/
		//System.out.println(in.byteValue());
		//System.out.println(j.byteValue());
		//System.out.println(Integer.compare(5, 5));
		/*System.out.println(Integer.compareUnsigned(5, -5));
		System.out.println( -5 + Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int k = -2147483648;
		int l = -5;
		System.out.println(k + l );*/
		/*System.out.println(Integer.decode("0x0010"));
		System.out.println(j.doubleValue());
		System.out.println(j.floatValue());*/
		//System.out.println(Integer.highestOneBit(i));
		//System.out.println(Integer.lowestOneBit(i));
		//System.out.println(Integer.numberOfLeadingZeros(i));
		//System.out.println(Integer.numberOfTrailingZeros(i));
		System.out.println(Integer.parseInt(s, 2));
		System.out.println(Integer.reverse(11));
		System.out.println(Integer.toBinaryString(i));
	}

}
