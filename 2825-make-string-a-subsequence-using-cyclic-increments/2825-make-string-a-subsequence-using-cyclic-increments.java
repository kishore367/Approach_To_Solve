class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0,j=0;
        int len1=str1.length();
        int len2=str2.length();

        for(; i<len1 && j<len2 ; i++){

            if(match(str1.charAt(i) , str2.charAt(j))){
                j++;
            }
        

        if(j==len2){
            return true;
        }
        }
        return false;
        
    }

    public boolean match(char a, char b){
        if(a == b || a+1 == b){
            return true;
        }
        if( a == 'z'&& b =='a' ){
            return true;
        }
         return false;
    }
   
}