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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        if(root==null)return a;
        Stack<TreeNode> st=new Stack<>();
        TreeNode Node=root;
        while(true){
            if(Node!=null){
                st.push(Node);
                Node=Node.left;
            }else{
                if(st.isEmpty())break;
                Node=st.pop();
                a.add(Node.val);
                Node=Node.right;
            }



        }
        return a;
    }
}