class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int sum=0;
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(-1);
        map.put(0,temp);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum--;
            }else{
            sum++;
            }
                if(map.containsKey(sum)){
                    ArrayList<Integer> t = map.get(sum);
                    t.add(i);
                }else{
                    ArrayList<Integer> t = new ArrayList<>();
                    t.add(i);
                    map.put(sum,t);
                }
        }int ans = 0;
                   Set<Integer> keys = map.keySet();
                   for( int i : keys){
                       if(map.get(i).size()>1){
                           ans=Math.max(ans,map.get(i).get(map.get(i).size()-1)-map.get(i).get(0));

                       }
                   }
                   
        return ans;
    }
}