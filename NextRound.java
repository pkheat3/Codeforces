import java.util.*;

public class NextRound {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt(); //total participants 
    int b=sc.nextInt(); //score of place needed to pass

    Integer[]d=new Integer[a];

    for(int i=0; i<a;i++)
    {
        d[i]=sc.nextInt();
    }
    int count=0;
    Arrays.sort(d, Collections.reverseOrder());

    int score= d[b-1];

    for(int j=0; j<a; j++)
    {
        if(d[j]>=score && d[j]!=0)
          count++;
 
    }
   
    System.out.println(count);
  }
}



