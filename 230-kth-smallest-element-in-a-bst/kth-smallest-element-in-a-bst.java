class Solution {
    public void inorder(TreeNode root, List<Integer> result)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left,result);  
        result.add(root.val); 
        inorder(root.right,result);
    }
    public int kthSmallest(TreeNode root, int k) {
       List<Integer> result = new ArrayList<>(); 
        inorder(root,result); 
        Collections.sort(result);
         int a[]=new int[result.size()];
          for (int i = 0; i < result.size(); i++){
            a[i] = result.get(i);
          }
         return a[k-1];
    }
}