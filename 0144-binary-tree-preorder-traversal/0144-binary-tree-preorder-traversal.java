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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        if(root==null)return a;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode tem=st.pop();
            if(tem.right!=null)st.push(tem.right);
            if(tem.left!=null)st.push(tem.left);
    a.add(tem.val);
            }
            return a;

    }
}