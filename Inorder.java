import java.util.*;

class Inorder{
    public List<Integer> inorder(Node root){
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    private void inorderHelper(Node root, List<Integer> result){
        if(root == null){
            return;
        }
        if(!root.children.isEmpty()){
            inorderHelper(root.children.get(0), result);
        }
        result.add(root.val);

        for(int i = 1; i< root.children.size(); i++){
            inorderHelper(root.children.get(i), result);
        }
    }
}