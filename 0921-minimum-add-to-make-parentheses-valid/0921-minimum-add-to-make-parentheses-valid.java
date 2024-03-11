class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        int end = 0;
        int count = 0;
        while(end < s.length()) {
            if(s.charAt(end) == '(')
                stack.push(s.charAt(end));
            else if(stack.isEmpty())
                count++;
            else
                stack.pop();
            end++;
        }
        
        return count + stack.size();
    }
}