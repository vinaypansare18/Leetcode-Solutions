class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {    
        int count = 0;
        int max = 0;   
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] == 1) 
            {
                count++;
                if (count > max)   // Update maximum consecutive ones
                {
                    max = count;
                }
            } 
            else 
            {
                count = 0;  // Reset when 0 is found
            }
        }
        return max;
    }
}