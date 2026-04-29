class Solution {
    public boolean isTrionic(int[] nums) {
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < nums[2]; j++) {
        //         if (nums[j]<nums[j+1]){
        //             return true;
        //         } else {
        //             return false;
        //         }
        //     }
        //     for (int j = nums[2]; j < nums[4]; j++) {
        //         if (nums[j]>nums[j+1]){
        //             return true;
        //         } else {
        //             return false;
        //         }
        //     }
        //     for (int j = nums[4]; j < nums.length; j++) {
        //         if (nums[j]<nums[j+1]){
        //             return true;
        //         }else {
        //             return false;
        //         }
        //     }
        // }
        // return true;
        int n = nums.length;
        if (n<3) return false;
        int i = 0;
        while (i < n - 1 && nums[i] < nums[i+1]) {
            i++;
        }if (i == 0) return false;
        int ph1 = i;
        while (i < n - 1 && nums[i] > nums[i+1]) {
            i++;
        }if (i == ph1) return false;
        int ph2 = i;
        while (i < n - 1 && nums[i] < nums[i+1]) {
            i++;
        }if (i == ph2) return false;
        return i == n - 1;
    }
}