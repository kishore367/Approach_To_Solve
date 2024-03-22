class Solution {
    public int maxDepth(String s) {
        //create a stack 
        Stack<String> stk = new Stack<>();
        //intilaze the third vsr as max
        int max=0;
        //itreate once 
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                //perform operation
                stk.push("(");
                //if size exceed it sould pop
                if(stk.size()>max)
                // assign the size
                    max=stk.size();
            }
            else if(s.charAt(i)==')')
                stk.pop();
        }
        return max;
    }
}