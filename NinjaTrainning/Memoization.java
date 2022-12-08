import java.util.*;
class Memoization
{
    public static void main(String[] args)
    {
        int[][] points={{10,40,70},
                    {20,50,80},
                    {30,60,90}};//210
        int n=points.length;
        int[][] dp=new int[n][4];
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        System.out.println(training(n-1,3,points,dp));
    }

    public static int training(int day,int last,int[][] points,int[][] dp)
    {
        if(day==0)
        {
            int max=0;
            for(int i=0;i<=2;i++)
            {
                if(last!=i)
                {
                    max=Math.max(points[day][i],max);
                }
            }
            return dp[day][last]=max;
        }
        
        if(dp[day][last]!=-1) return dp[day][last];

        int max=0;
        for(int i=0;i<=2;i++)
        {
            if(last!=i)
            {
                int task=points[day][i]+training(day-1,i,points,dp);
                max=Math.max(task,max);
            }
        }
        return dp[day][last]=max;
    }
}