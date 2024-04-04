/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //create a list of result can be stored
        
        List<List<Integer>> result=new ArrayList<>();
        //if there is no root  return the BT

        if(root==null){
            return result;
        }
        //now,BFS can be done in queue

        Queue<TreeNode> queue=new LinkedList<>();
        //queue will insert the root 
        queue.offer(root);

        while(!queue.isEmpty()){
           int level=queue.size();
           List<Integer> store=new ArrayList<>(level);

            //Traverse once whole tree 
           for(int i=0;i<level;i++){
            //now,pop the element by level
            TreeNode currentNode=queue.poll();
            //Atlast add to single area
            store.add(currentNode.val);
            //add the left,right elements in level
            if(currentNode.left!=null){
                queue.offer(currentNode.left);
            }
            if(currentNode.right!=null){
                queue.offer(currentNode.right);
            }
           }
           //now,the ArrayList will add stored elements
           result.add(store);
        }
        return result;
    }
}