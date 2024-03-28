class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        int sum=0;
        int len=nums.length;
        Map<Integer,Integer> map=new HashMap();

        for(int left=0,right=0;right<len;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.get(nums[right])>k){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }

            sum=Math.max(sum,right-left+1);
        }
        return sum;


        
    }
}