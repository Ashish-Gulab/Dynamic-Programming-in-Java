import java.util.*;
class Memoization
{
    public static void main(String[] args)
    {
        int[] height={30,10,60,10,60,50};
        int n=height.length;
        int k=2;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(jump(height,n-1,k,dp));
    }

    public static int jump(int[] height,int n, int k,int[] dp)
    {
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int mmsteps=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++)
        {
            if(n-i>=0)
            {
                int frogjump=jump(height,n-i,k,dp)+Math.abs(height[n-i]-height[n]);
                mmsteps=Math.min(frogjump,mmsteps);    
            }
        }
        return dp[n]=mmsteps;
    }
}