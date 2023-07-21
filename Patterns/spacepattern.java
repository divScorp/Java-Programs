public class space_alphabet
{
      public static void main(String args[])
    {
        int i,j,k,m;
        int sp=-1;
        for(i=69;i>=65;i--)
            {
               for(j=65;j<=i;j++)
            {
                System.out.print((char)j);
            }
            for(k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            if(i==69)
            {
             m=i-1;
            }
            else
            {
                m=i;
            }
            for(j=m;j>=65;j--)
            {
                System.out.print((char)j);
            }
            System.out.println();
            sp=sp+2;
        }
    }
}           
  
