import java.util.*;

public class Codeforces {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		
		int a = sc.nextInt();//cost of first
		int b= sc.nextInt(); //money had
		int c= sc.nextInt(); //wanted
		int total=0; 
		total+=a;
		for(int i=2; i<=c;i++)
		{

				total+=a*i;
            


		}
      if(total-b>0)
		   System.out.println(total-b);
      else 
         System.out.println("0");
	}

}
