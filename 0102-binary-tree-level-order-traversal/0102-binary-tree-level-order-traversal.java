class Solution {
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> result=new ArrayList<>();
        Queue <TreeNode> q=new LinkedList<>();
        if(root==null){
            return result;
        }
        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer> li=new ArrayList<>();
           int a=q.size();
           for(int i=0;i<a;i++)
           {
            TreeNode temp=q.poll();
            li.add(temp.val);
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
           }
           result.add(li);
        }
        return result;
    }
}