public class Solution {
    public boolean canChange(String start, String target) {
        int n = start.length();
      //  L and R
        int startPointer = 0, targetPointer = 0;

        for (; startPointer < n || targetPointer < n; ) {
            // Move pointers to the next non-blank character
            while (startPointer < n && start.charAt(startPointer) == '_') {
                startPointer++;
            }
            while (targetPointer < n && target.charAt(targetPointer) == '_') {
                targetPointer++;
            }

            // If both pointers reached the end, it's valid
            if (startPointer == n && targetPointer == n) {
                return true;
            }

            // If only one pointer reaches the end, it's invalid
            if (startPointer == n || targetPointer == n) {
                return false;
            }

            // Ensure the characters match
            if (start.charAt(startPointer) != target.charAt(targetPointer)) {
                return false;
            }

            // Check the movement constraints
            if (start.charAt(startPointer) == 'L' && startPointer < targetPointer) {
                return false; // L can't move to the right
            }
            if (start.charAt(startPointer) == 'R' && startPointer > targetPointer) {
                return false; // R can't move to the left
            }

            // Move both pointers
            startPointer++;
            targetPointer++;
        }

        return true;
    }
}
