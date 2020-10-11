// reverse_each_word
import java.util.*;
public class reverse_each_word
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,j;
        System.out.println("enter string");
        StringTokenizer s=new StringTokenizer(ob.nextLine(),"!");
        int n=s.countTokens();//count words
        String a[]=new String[n];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextToken();
        }
        for(i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
