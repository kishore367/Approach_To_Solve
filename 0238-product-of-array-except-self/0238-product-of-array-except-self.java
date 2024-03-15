class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length=nums.length;
        int[] ret=new int[length];
        int product=1;
        int flag=0;

        List<Integer> zeroList=new ArrayList<>();
        for(int i=0;i<length;i++){
            if(nums[i]==0){
                flag++;
            zeroList.add(i);
            }
            else{
                product*=nums[i];
            }
        } 

         if(flag==0){
            for(int i=0;i<length;i++){
                ret[i]=product/nums[i];
            }
         }
            else if(flag==1){
                ret[zeroList.get(0)]=product;
            }
        
        return ret;
 }
}