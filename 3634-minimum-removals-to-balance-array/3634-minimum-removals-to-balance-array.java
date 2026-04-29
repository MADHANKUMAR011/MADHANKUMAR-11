class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int win = 0;
        int left = 0;
        for (int i = 0; i < n; i++) {
            while (nums[i]>(long)nums[left]*k){
                left++;
            }
            win = Math.max(win,i-left+1);
        }
        return n - win;
    }
}