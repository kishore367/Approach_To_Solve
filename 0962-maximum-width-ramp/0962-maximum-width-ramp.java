class Solution {
    public int maxWidthRamp(int[] nums) {

        int len = nums.length;
        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<len;i++){
            if(stk.isEmpty() || nums[stk.peek()]>nums[i]){
                stk.push(i);
            }
        }

        int maxWidth=0;

        for(int j=len-1;j>=0;j--){
            while(!stk.isEmpty() && nums[stk.peek()]<=nums[j]){
                maxWidth = Math.max(maxWidth,j-stk.pop());
            }
        }

        return maxWidth;
        
    }
}