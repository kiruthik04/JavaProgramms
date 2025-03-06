import java.util.*;

class TreeNode{
    String data;
    List<TreeNode> children;

    public TreeNode(String data){
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child){
        children.add(child);
    }

    public void printTreeDFS(int level){
        System.out.println("    ".repeat(level) + data);
        for(TreeNode child : children){
            child.printTreeDFS(level + 1);
        }
    }
}

public class nAryTree{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter root node : ");
        String rootData = scanner.nextLine();
        TreeNode root = new TreeNode(rootData);

        buildTree(root, scanner);

        System.out.println("\nPrinting Generic Tree using DFS:");
        root.printTreeDFS(0);

        scanner.close();
    }

    private static void buildTree(TreeNode parent, Scanner scanner){
        System.out.print("Enter number of children for "+ parent.data + ": ");
        int numChildren = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numChildren; i++){
            System.out.print("Enter child " + i + " of " + parent.data + ": ");
            String childData = scanner.nextLine();
            TreeNode child = new TreeNode(childData);
            parent.addChild(child);

            buildTree(child, scanner);
        }
    }
}