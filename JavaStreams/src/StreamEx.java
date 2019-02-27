import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {

		Collection<Character> ch =  Arrays.asList('A','A','A','B','B','C','C');
		Collection<Character> newCh = new ArrayList<Character>();
		
		ch.stream().filter( StreamEx:: isBorC).map(StreamEx::getArea).collect(Collectors.toCollection(()  -> newCh));						
										
		ch.stream().filter( StreamEx:: isBorC).map(StreamEx::getArea).forEachOrdered(c -> System.out.println(c));
		
		ch.stream().filter( (c) -> isBorC(c)).map((c) -> getArea(c)).forEachOrdered(c -> System.out.println(c));
	}
	
	public static Character getArea(Character c){
		if(c.equals('C')) return 'c';
		if(c.equals('B')) return 'b';
		else return null;
		
	}
	
	public static boolean isB(Character c){
		return c.equals('B');
		
	}
	
	public static boolean isC(Character c){
		return c.equals('C');
	}
	
	public static boolean isBorC(Character c){
		return isB(c) || isC(c);
	}
}
