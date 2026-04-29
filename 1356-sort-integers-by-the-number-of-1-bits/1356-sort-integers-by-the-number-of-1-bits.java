class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int[] count = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            count[i] = Integer.bitCount(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(count[i]>count[j]||(count[i]==count[j]&&arr[i]>arr[j])){
                    int temparr = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temparr;
                    int tempcount = count[i];
                    count[i] = count[j];
                    count[j] = tempcount;
                }
            }
        }
        return arr;
    }
}