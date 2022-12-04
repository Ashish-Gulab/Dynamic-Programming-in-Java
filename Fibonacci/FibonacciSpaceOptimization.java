import java.util.*;
class FibonacciSpaceOptimization
{
    public static void main(String[] args)
    {
        int n=5;
        int prev=1;
        int prev2=0;
        if(n==0) System.out.println(prev2);
        if(n==1) System.out.println(prev);
        for(int i=2;i<=n;i++)
        {
            int cur=prev+prev2;
            prev2=prev;
            prev=cur;
        }
        System.out.println(prev);
    }
}