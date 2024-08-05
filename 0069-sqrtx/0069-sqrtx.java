class Solution {
    public int mySqrt(int x) {
        int c = 0;

        if (x == 0 || x == 1) {
            c = x;
        } else {
            for (int j = 1; j <= x; j++) {
                if (j * j == x) {
                    c = j;
                    break;
                } else if (j * j > x) {
                    c = j - 1;
                    break;
                }
            }
        }

        return c;
        }
        }
