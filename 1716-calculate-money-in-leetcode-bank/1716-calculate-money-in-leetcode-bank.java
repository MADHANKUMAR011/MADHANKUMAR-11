class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int mondayst = 1;
        int days  = 0;
        while(days<n){
            for(int i = 0;i<7&&days<n;i++){
                total += (mondayst + i);
                days++;
            }
            mondayst++;
        }
        return total;
    }
}