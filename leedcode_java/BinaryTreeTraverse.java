/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/* public class TreeNode{
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x){val=x;}
     }*/
     
public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(root==null)
        {
            return list;
        }
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        while(!stack.empty())
        {
            TreeNode n=stack.pop();
            list.add(n.val);
            if(n.right!=null)//右节点入栈
            {
                stack.push(n.right);
            }
            if(n.left!=null)// 左节点入栈
            {
                stack.push(n.left);
            }
        }
        return list;
        
    }
}