package corejava;

public class Multidimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[][] = new int[2][3];
      a[0][0]=2;
      a[0][1]=4;
      a[0][2]=7;
      a[1][0]=3;
      a[1][1]=4;
      a[1][2]=7; 
     // System.out.println(a[1][0]);
	
	/*	int b[][]= { {2,4,5},{3,4,7},{5,2,1} };
		System.out.println(b[2][1]); */
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
      
	}

}
