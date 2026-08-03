class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;
        int sum = (range*(range+1))/2;
        int arrsum = 0;
        for(int i = 0 ; i<nums.length;i++){
            arrsum += nums[i];
        }
        int res = sum - arrsum;
        return res;
    }
}