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
    public int difference(int[] answer,int n)
    {int k=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {int diff=0;
             for(int j=i+1;j<n;j++)
             {
                  diff = answer[i]-answer[j];
                  if(diff<0)
                  {
                    diff=diff*-1;
                  }
                   k=Math.min(diff,k);
             }
            
        }
        return k;
    }
    public int getMinimumDifference(TreeNode root) {
         TreeNode temp;
         int res=Integer.MAX_VALUE;
        Queue<TreeNode> q1= new LinkedList<>();
        int[] answer=new int[100000];int k=0;
        if(root==null)
        {
          return 0;
        }
        q1.offer(root);
        while(!q1.isEmpty())
       {
          int a1=q1.size();
          for(int i=0;i<a1;i++)
          {
          temp=q1.poll();
          if(temp.left!=null)
          {
             q1.add(temp.left);
           }
          if(temp.right!=null)
          {
            q1.add(temp.right);
           }
            answer[k]=temp.val;
            k++;
           }
      }
    res=difference(answer,k);
      return res;
    }
}