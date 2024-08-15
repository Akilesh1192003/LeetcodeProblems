class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length;
        int[] ans = new int[n + 1];
        int totalXOR = 0;
        for (int i = 1; i <= n + 1; i++) {
            totalXOR ^= i;
        }
        int oddXOR = 0;
        for (int i = 1; i < n; i += 2) {
            oddXOR ^= encoded[i];
        }
        ans[0] = totalXOR ^ oddXOR;
        for (int i = 0; i < n; i++) {
            ans[i + 1] = ans[i] ^ encoded[i];
        }
        return ans;
    }
}
