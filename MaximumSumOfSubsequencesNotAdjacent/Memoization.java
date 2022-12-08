import java.util.*;
class Memoization
{
    public static void main(String[] args)
    {
        int[] arr={2,1,6,9};
        int n=arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(subsequences(n-1,arr,dp));
    }

    public static int subsequences(int n,int[] arr,int[] dp)
    {
        if(n==0) return arr[n];
        if(dp[n]!=-1) return dp[n];
        int pick=arr[n];
        if(n>1)
        {
            pick+=subsequences(n-2,arr,dp);
        }
        int nonPick=0+subsequences(n-1,arr,dp);
        return dp[n]=Math.max(pick,nonPick);
    }
}