class Solution {
    // Time O(n) Space O(1), n = length of 's'
    public int minimumLength(String s) {
        int lt = 0, rt = s.length()-1;
        while(lt<rt && s.charAt(lt)==s.charAt(rt))
        {
            char cur = s.charAt(lt);
            while(lt<rt && s.charAt(lt)==cur) lt++;
            while(lt<=rt && s.charAt(rt)==cur) rt--;
        }
        return 1+rt-lt;
    }
}