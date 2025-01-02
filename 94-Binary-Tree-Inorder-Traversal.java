
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    traverse(root, list);
    return list;
}

public void traverse(TreeNode node, ArrayList<Integer> list) {
    if(node == null) {
        return;
    }
    traverse(node.left, list);
    list.add(node.val);
    traverse(node.right, list);
        
    }
}