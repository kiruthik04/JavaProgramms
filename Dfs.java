public static boolean searchDFS(TreeNode root, String target){
    if (root == null) return false;
    if(root.data.equals(target)) return true;
    for(TreeNode c : root.children){
        if(searchDFS(c, target)) return true;
    }
    return false;
}

public static TreeNode deleteLeaf(TreeNode root, String target){
    if (root == null) return null;
    if(root.data.equals(target) && root.children.isEmpty()){
        return null;
    }
    deleteLeafHelper(root, null, target);
    return root;
}
private static boolean deleteLeafHelper(TreeNode node, TreeNode parent, String target){
    if (node == null) return false;
    if(node.data.equals(target) && node.children.isEmpty()){
        if(parent != null){
            parent.children.remove(node);
        }
        return true;
    }
    for(TreeNode child: node.children){
        if(deleteLeafHelper(child, node, target)){
            return true;
        }
    }
    return false;
}