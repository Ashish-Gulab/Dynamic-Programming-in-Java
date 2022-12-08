import java.util.*;
class Tabulation
{
    public static void main(String[] args)
    {
        int[] arr={2,1,6,9};
        int n=arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(subsequences(n,arr,dp));
    }

    public static int subsequences(int n,int[] arr, int[] dp)
    {
        dp[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            int pick=arr[i];
            if(i>1)
            {
                pick=pick+dp[i-2];
            }
            int nonPick=0+dp[i-1];
            dp[i]=Math.max(pick,nonPick);
        }
        return dp[n-1];
    }
}