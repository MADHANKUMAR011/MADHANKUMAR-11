class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> already = new HashSet<>();
        for(int num : nums){
            if(!seen.add(num)){
                if(already.add(num)){
                    return num;
                }
            }
        }
        return -1;
    }
}