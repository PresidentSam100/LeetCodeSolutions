/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Deque<TreeNode> o_st = new ArrayDeque();
        Deque<TreeNode> c_st = new ArrayDeque();
        TreeNode o_n = original;
        TreeNode c_n = cloned;
        while (!o_st.isEmpty() || o_n != null) {
            while (o_n != null) {
                o_st.add(o_n);
                c_st.add(c_n);
                o_n = o_n.left;
                c_n = c_n.left;
            }
            o_n = o_st.removeLast();
            c_n = c_st.removeLast();
            if (o_n == target) {
                return c_n;
            }
            o_n = o_n.right;
            c_n = c_n.right;
        }
        throw new IllegalStateException("invalid");
    }
}
