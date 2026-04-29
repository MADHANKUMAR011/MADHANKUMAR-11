class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            fact *= i;
            numbers.add(i);
        }
        numbers.add(n);
        k=k-1;
        String result = "";
        for (int j = 0; j < n; j++) {
            int index = k / fact;
            result += numbers.get(index);
            numbers.remove(index);
            if (numbers.isEmpty()) {
                break;
            } else {
                k = k % fact;
                fact = fact / numbers.size();
            }
        }
        return result;
    }
}