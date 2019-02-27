package learnannotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

@MyAnno(str = "", value = 0)
public class LearnAnnotation {
	
	private int i = 10;
	private String s = "hello";
	public Integer in = new Integer(15);
	public static String str = "world";
	public static ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnAnnotation a = new LearnAnnotation();
		Class<?> c = a.getClass();
		try {
			Method m = c.getMethod("annoCheck");
			MyAnno anno = m.getAnnotation(MyAnno.class);
			//System.out.println(anno.str() + " " + anno.value());
			
			//System.out.println(c.getClassLoader());
			Annotation[] ac = c.getAnnotations();
			
			for (Annotation ann : ac){
				//System.out.println(ann.annotationType());
			}
			/*System.out.println(c.getCanonicalName());
			System.out.println(c.getName());
			System.out.println(c.getSimpleName());*/
			
			Class<?>[] classFields = c.getDeclaredClasses();
			for (Class<?> field : classFields){
					System.out.println(field.getName());
			}
			
			Field[] fields = c.getDeclaredFields();
			for (Field field : fields){
					System.out.println(field.getModifiers() + " " + field.getName());
			}
			
			Field[] fields2 = c.getFields();
			for (Field field : fields2){
					System.out.println(field.getModifiers() + " " + field.getName());
			}
			
			try {
				LearnAnnotation la = (LearnAnnotation) c.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@MyAnno( str="this is my anno" , value = 10)
	public static void annoCheck(){
		
	} 

}
