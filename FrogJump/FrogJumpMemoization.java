import java.util.*;
class FrogJumpMemoization
{
    public static void main(String[] args)
    {
        int[] height={30,10,60,10,60,50};
        int n=height.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(jump(n-1,height,dp));
    }

    public static int jump(int n,int[] height,int[] dp)
    {
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int jump2=Integer.MAX_VALUE;
        int jump1=jump(n-1,height,dp)+Math.abs(height[n-1]-height[n]);
        if(n>1)
        {
            jump2=jump(n-2,height,dp)+Math.abs(height[n-2]-height[n]);
        }
        return dp[n]=Math.min(jump1,jump2);
    }
}