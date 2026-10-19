class Solution 
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
       int max=0;
       for(int can:candies)
       {
        max=Math.max(max,can);
       }
       List<Boolean>result=new ArrayList<>();
       for(int can:candies)
       {
        result.add(can+extraCandies>=max);
       }
       return result;
        
    }
}