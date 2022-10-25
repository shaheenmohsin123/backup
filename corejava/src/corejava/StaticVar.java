package corejava;

public class StaticVar {
    String name;
    String address;
    static String city="Bangalore";
    static int i=0;
    
	StaticVar(String name,String address)
	{
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress()
	{
		System.out.println(address+""+city);
	}


   public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar obj = new StaticVar("Bob","Marthalli");
		StaticVar obj1 =new StaticVar("John","Jayanagar");
		obj.getAddress();
		obj1.getAddress();
	}

}
