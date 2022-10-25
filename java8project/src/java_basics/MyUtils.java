package java_basics;

public class MyUtils {

	public static void printSomeJunk(String anything){
		System.out.println("Some bla bla bla " + anything);
	} 
    
	public static void printSomeJunk(int anything){
		System.out.println("Integer passed in " + anything);
	}
	public static void  sum2numbers(int firstnumb, int secondnumb) {
		System.out.println(firstnumb + secondnumb);
	}
	public static int add10(int someArgument) {
		int result= someArgument + 10;
		return result;
	}
	public static String printSomeFun(String anything){
		String result= "Am i right " + anything;
		return result;
	}
	
	
}
