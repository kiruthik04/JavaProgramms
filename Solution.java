class Solution{
    private int minSize = Integer.MAX_VALUE;

    public int minSubtreeSumBST(int target, Node root){
        findSubtree(root,target);

        return (minSize == Integer.MAX_VALUE) ? -1 : minSize;
    }

    private int[] findSubTree(Node root, int target){
        if (root == null){
            return new int[]{1, 0, 0, Integer.MAX_VALUE, Integer.MIN_VALUE};
        }

        int[] left = findSubTree(root.left, target);
        int[] right = findSubTree(root.right, target);

        boolean isBST = (left[0]  == 1) && (right[0] == 1) && 
                        (root.data > left[4]) && (root.data < right[3]);

        int currentSum = root.data + left[1] + right[1];
        int currentSize = 1 + left[2] + right[2];

        if(isBST && currentSum == target){
            minSize = Math.min(minSize, currentSize);
        }

        return new int[]{
            isBST ? 1 : 0,
            currentSum,
            currentSize,
            Math.min(root.data, left[3]),
            Math.max(root.data, right[4])
        };
        
    }
}