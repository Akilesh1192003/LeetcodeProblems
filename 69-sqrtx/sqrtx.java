class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1, right = x, result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid*mid is equal to x
            if (mid == x / mid) {
                return mid;
            }

            // If mid*mid is less than x, discard the left half
            if (mid < x / mid) {
                left = mid + 1;
                result = mid;  // Update result as we need floor value
            } else {  // If mid*mid is more than x, discard the right half
                right = mid - 1;
            }
        }

        return result;
        }}
