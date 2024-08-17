class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue <TreeNode> q=new LinkedList<>();
        List<Double> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        q.offer(root);
        while(!q.isEmpty())
        {
           int a=q.size();double b=0;
           for(int i=0;i<a;i++)
           {
            TreeNode temp=q.poll();
             b=b+temp.val;
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
           }
           res.add(b/a);
        }
        return res;
    }
}