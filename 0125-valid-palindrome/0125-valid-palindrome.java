/*Convert all uppercase letters to lowercase (or vice versa, depending on your preference).
Remove all whitespace from the string.
Remove or ignore special characters such as commas (,), colons (:), etc.
Finally, compare the beginning and the end of the string to check if it reads the same forward and backward.*/
class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();

        int first = 0;
        int last = s.length()-1;

        while(first<=last){
            char f = str.charAt(first);
            char l = str.charAt(last);

            if(!Character.isLetterOrDigit(f)){
                first++;
            }
           else if(!Character.isLetterOrDigit(l)){
                last--;
            }

            else{
                if(f!= l)
                return false;
            

            first++;
            last--;

        }
        }

        return true;
       

    }
}