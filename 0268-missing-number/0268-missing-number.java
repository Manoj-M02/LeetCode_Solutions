class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length;
       int sumOfn = (n*(n+1))/2;
       int sumOfnums = 0;
       for (int i=0; i<n; i++){
        sumOfnums = sumOfnums + nums[i];
       }
        int res =sumOfn - sumOfnums;
       return res ;
    }
}