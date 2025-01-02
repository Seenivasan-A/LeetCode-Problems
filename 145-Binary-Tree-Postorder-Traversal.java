
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    traverse(root, list);
    return list;
}

public void traverse(TreeNode node, ArrayList<Integer> list) {
    if(node == null) {
        return;
    }
    traverse(node.left, list);
    traverse(node.right, list);
    list.add(node.val);
    }
}
