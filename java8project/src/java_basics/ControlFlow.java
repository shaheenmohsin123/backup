package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
	boolean hungry=false;
		if(hungry)
	{
		System.out.println("I am hungry");
		
	}
	else
	{
		System.out.println("I am not hungry");
	}
     
		int it=40;
		int ct=20;
		String option   ;
		if(ct<it-30) {
			option= "cold";
		}else if(ct>it-30) {
			option="hot";
		}else {
			option="beautiful";
		}
		
		System.out.println(option);
		

		int month=2;
		String monthstring;
		switch(month) {
		case 1: monthstring="jan";
		break;
		case 2: monthstring="feb";
		break;
		case 3: monthstring ="march";
		break;
		case 4: monthstring ="april";
		break;
		default: monthstring ="Unknown month";
	    break;
		}
	    System.out.println(monthstring);
		
		
		
		
			
		
	
	
	}

}
