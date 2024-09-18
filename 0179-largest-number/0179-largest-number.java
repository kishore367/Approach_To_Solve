import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String largestNumber(int[] nums) {

        // Convert the integer array to a string array
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort the string array based on the custom comparator
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: If the largest number is "0", return "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Append all strings to form the largest number
        StringBuilder result = new StringBuilder();
        for (String str : strNums) {
            result.append(str);
        }

        return result.toString();
    }
}
