class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] temp = new int[nums.length];
        int count = 0;
        for(int i= 0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                temp[count] = nums[i];
                count++;
                i++;
            }
        }
        return Arrays.copyOf(temp,count);
    }
}