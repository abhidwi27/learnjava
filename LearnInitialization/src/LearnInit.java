public class  LearnInit {
	
	
		public static void main(String args[]) {
			int b = -5;
			
			b = (byte) ( b | -4);
			System.out.println(" OR :" + b );
			
			b=-5;
			b = (byte) ( b & -4);
			System.out.println(" AND :" + b );
			
			b=-5;
			b = (byte) ( b ^ -4);
			System.out.println(" XOR :" + b );
			
			b=-5;
			b = (byte) ( ~b);
			System.out.println(" Complement :" + b );
			
			b=-5;
			b = (byte) ( b << 2);
			System.out.println(" Left Shift :" + b );
			//b = (byte) ( b <<< 2); // Compile Error
			
			b=-5;
			System.out.println("Before right shift: " + Integer.toBinaryString(b));
			b = (byte) ( b >> 34);
			System.out.println(" Right :" + b );
			System.out.println("After right shift: " + Integer.toBinaryString(b));
			
			b=-5;
			System.out.println("Before right shift: " + Integer.toBinaryString(b));
			b = (byte) ( b >>> 32);
			System.out.println(" Unsigned Right :" + b );
			System.out.println("After Unsigned right shift: " + Integer.toBinaryString(b));
			
		
				
		}
}