class Solution 
{
    public int romanToInt(String s) 
    {
            int[] romanToInt = new int[128];
        romanToInt['I'] = 1;
        romanToInt['V'] = 5;
        romanToInt['X'] = 10;
        romanToInt['L'] = 50;
        romanToInt['C'] = 100;
        romanToInt['D'] = 500;
        romanToInt['M'] = 1000;

        int total = 0;
        int prevValue = 0;

        // Iterate through the string in reverse
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = romanToInt[c];

            // Determine whether to add or subtract based on the previous value
            if (value >= prevValue) {
                total += value;
            } else {
                total -= value;
            }

            prevValue = value;
        }

        return total;
    }
}