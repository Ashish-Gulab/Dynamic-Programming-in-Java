import java.util.*;
class Tabulation
{
    public static void main(String[] args)
    {
        int[] height={30,10,60,10,60,50};
        int n=height.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        int k=2;
        System.out.println(jumpTab(n,height,k,dp));
    }

    public static int jumpTab(int n,int[] height,int k, int[] dp)
    {
        dp[0]=0;
        for(int i=1;i<n;i++)
        {
            int mmsteps=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++)
            {
                if(i-j>=0)
                {
                    int jump=dp[i-j]+Math.abs(height[i-j]-height[i]);
                    mmsteps=Math.min(jump,mmsteps);
                }
            }
            dp[i]=mmsteps;
        }
        return dp[n-1];
    }
}