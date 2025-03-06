class Node{
    int data;
    Node left, right;

    public Node(int item){
        data = item;
        left = right = null;
    }
}

class BinaryTree{
    
    private Node root;

    public BinaryTree(){
        root = null;
    }

    public void insert(int data){
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data){
        if (root == null){
            root = new Node(data);
            return root;
        }

        if (data < root.data){
            root.left = insertRec(root.left, data);
        }
        
        else if(data > root.data){
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public boolean search(int data){
        return searchRec(root, data) != null;
    }

    private Node searchRec(Node root, int data){
        if(root == null|| root.data == data){
            return root;
        }
        
        if(data < root.data){
            return searchRec(root.left, data);
        }

        return searchRec(root.right, data);
    }

    private Node minValueNode(Node node){
        Node current = node;
        while(current.left != null){
            current = current.left;
        }
        return current;
    }

    public int length(){
        return lengthRec(root);
    }

    private int lengthRec(Node root)
}