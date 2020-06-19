import java.util.*;


public class BoyOrGirl {
  public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
    String a= input.nextLine();
    ArrayList<Character> c= new ArrayList<>(100);

    for(int i=0; i<a.length(); i++)
    {
        if(BoyOrGirl.check(c,a.charAt(i))==false)
        {
            c.add(a.charAt(i));
        }

        
    }
 
    if(c.size() %2 ==1)
      System.out.println("IGNORE HIM!");
    else 
      System.out.println("CHAT WITH HER!");
 }




public static boolean check(ArrayList<Character> z, char a)
{
    boolean p=false;
 
    for(int i=0; i< z.size();i++)
    {
      if(z.get(i)==a)
      {
        p=true;
      }

    }

    return p; 
}

}
