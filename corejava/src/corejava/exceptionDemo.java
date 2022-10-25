package corejava;

public class exceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int b=7;
     int c=0;
     try
     {
    	// int k = b/c;
    	// System.out.println(k);
    	// int ar[]= new int[5];
    	// System.out.println(ar[7]);
     }
     catch(ArithmeticException ae)	
     {
    	 System.out.println("I caught arithmetic exception");
     }
     catch(IndexOutOfBoundsException io)
     {
    	 System.out.println("I caught indexBound exception");
     }
     
     catch(Exception e)
     {
	   System.out.println("I caught the error/exception");
     }
	 finally
	 {
	   System.out.println("delete cookies");
	 }
		
		
	}

}
