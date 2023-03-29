//to print spy numbers upto range

import java.util.Scanner;
public class Spyrange {
    public static void main(String args[])
    {
        int i;
        for(i=1;i<=1000;i++)
        {
            int n,sum=0,k,mul=1;
           n=i;

         while(n>0)
        {
        k=n%10;
        sum=sum+k;
        mul=mul*k;
        n=n/10;
      }
      if(sum==mul)
    {
        System.out.println("spy numbers are= "+i);
    }
   
    }
}
}