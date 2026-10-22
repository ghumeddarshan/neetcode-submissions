class Solution {
    public int[] getConcatenation(int[] nums) {
        int lengthOfNums=nums.length;
        int[] ans= new int[2*lengthOfNums];
        int counter1=0; int j=0;
        for(int i=0;i<lengthOfNums;i++)
          {
            if(counter1<=1)
            {ans[j]=nums[i];
            if(i==lengthOfNums-1) {i=-1;counter1++;}
            j++;}
          }
          return ans;
    }
}