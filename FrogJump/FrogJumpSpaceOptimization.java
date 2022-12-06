import java.util.*;
class FrogJumpSpaceOptimization
{
    public static void main(String[] args)
    {
        int[] height={30,10,60,10,60,50};
        int n=height.length;
        int prev=0;
        int prev2=0;
        int jump2=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            int jump1=prev+Math.abs(height[i-1]-height[i]);
            if(i>1)
            {
                jump2=prev2+Math.abs(height[i-2]-height[i]);
            }
            int cur_i=Math.min(jump1,jump2);
            prev2=prev;
            prev=cur_i;
        }
        System.out.println(prev);
    }
}