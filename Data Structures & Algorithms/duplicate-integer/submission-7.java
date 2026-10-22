class Solution {
    public boolean hasDuplicate(int[] nums) {
        int[]c=new int[nums.length];
        boolean flag=false;
        if(nums.length>0)
        {c[0]=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
          int temp=nums[i];
          for(int j=0;j<i;j++)
          {
            if(c[j]==temp) return !flag;
          }
          c[count]=nums[i];
          count++;
        }
    }
        return flag;
    }
}