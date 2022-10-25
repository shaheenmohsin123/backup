package corejava;

public class ChildDemo extends ParentDemo {

	String name="QAClickAcademy";
	public void getStringdData()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	 public void getData()
	 {   
		 super.getData();
		 System.out.println("I am in child class");
	 }
	
	public ChildDemo()
	{
		System.out.println("child class constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ChildDemo cd = new ChildDemo();
		//cd.getStringdData();
		//cd.getData();
		
	}

}
