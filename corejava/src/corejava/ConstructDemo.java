package corejava;

public class ConstructDemo {
 public ConstructDemo()
 {
	System.out.println("I am in the constructor"); 
 } 
public void getData()
{
   System.out.println("Iam in the method");	
}
	
public ConstructDemo(int a, int b)	
{
	System.out.println("I am in the parameterized constructor");
	int c=a+b;
	System.out.println(c);
}

public ConstructDemo(String str)
{
  System.out.println(str);	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructDemo cd=new ConstructDemo("hello");
		ConstructDemo cn=new ConstructDemo(4,5);
	}

}
