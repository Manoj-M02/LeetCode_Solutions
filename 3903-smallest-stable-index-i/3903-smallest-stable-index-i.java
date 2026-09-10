class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        for (int i=0;i<n;i++){
            int maxvalue = nums[i];
            int minvalue = nums[i];
            for (int j=0; j<i; j++){
                maxvalue =Math.max(maxvalue,nums[j]);
            }
            for (int j= i+1;j<n;j++){
                minvalue = Math.min(minvalue,nums[j]);
            }
            if(maxvalue - minvalue <= k){
                return i;
            }
        }
        return -1;
    }
}