class Solution {
    public int trap(int[] height) {
        if (height==null||height.length==0) return 0;
        int n=height.length;
        int[] left_max=new int[n];
        int[] right_max=new int[n];
        int total_water=0;
        int water_height=0;
        left_max[0]=height[0];
        for(int i=1;i<n;i++) {
            left_max[i]=Math.max(height[i],left_max[i-1]);
        }
        right_max[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--) {
            right_max[i]=Math.max(height[i],right_max[i+1]);
        }
        for(int i=0;i<n;i++){
            int min=Math.min(left_max[i],right_max[i]);
            water_height=min-height[i];
            if(water_height>0){
            total_water+=water_height;
            }
        }
        return total_water;
    }
}