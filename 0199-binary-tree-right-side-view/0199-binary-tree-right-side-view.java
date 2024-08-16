class Solution {
    public List<Integer> rightSideView(TreeNode root)
    {
        List<Integer> list=new ArrayList<>();
        if(root ==null){return list;}
        Queue <TreeNode> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            int a=qu.size();
            TreeNode temp=null;
            for(int i=0;i<a;i++)
            {
               temp =qu.poll();
               if(temp.left!=null)
               {
                qu.add(temp.left);
               }
                if(temp.right!=null)
               {
                qu.add(temp.right);
               }
            }
            list.add(temp.val);
        }
        return list;

    }
}