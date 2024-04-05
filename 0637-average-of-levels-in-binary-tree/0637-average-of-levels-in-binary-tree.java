class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> output = new ArrayList<>();
        int h = height(root);
        double sum[] = new double[h+1];
        int num[] = new int[h+1];
        averageOfLevelsRec(root, sum, num, h);
        for(int i = h; i > -1; i--){
            output.add(sum[i]/num[i]);
        }
        return output;
    }

    private void averageOfLevelsRec(TreeNode node, double[] sum, int[] num, int j){
        if(node == null)
            return;
        sum[j] += node.val;
        num[j] += 1;
        averageOfLevelsRec(node.left, sum, num, j-1);
        averageOfLevelsRec(node.right, sum, num, j-1);
    }

    private int height(TreeNode node){
        if(node == null)
            return -1;
        return 1 + Math.max(height(node.left),height(node.right));
    }
}