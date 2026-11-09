class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [][] indices=new int[nums.length][2];
        int indicesCount1=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                indices[indicesCount1][0]=i;
                indices[indicesCount1][1]=j;
                indicesCount1++;
                }
            }
        }
        return indices[0];
    }
}
