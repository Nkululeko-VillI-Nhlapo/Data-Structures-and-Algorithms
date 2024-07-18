public class numOfLeavesInaTre{
    public static int countLeaves(TreeNode root ){
        if (root == null){
            return 0;
        }

        else if (root.left == null && root.right == null){
            return 1;
        }

        else{
            return countLeaves(root.left)  + countLeaves(root.right);
        }
    }

   public static int countNodesWithOneChild(TreeNode root){
        if (root == null){
            return 0;
        }

        else if(root.left != null + root.right != null){
            return countNodesWithOneChild(root.left) + countNodesWithOneChild(root.right);
        } 
        else{
            return 1 + countNodesWithOneChild(root.left) + countNodesWithOneChild(root.right);
        }
   }

   public static int countNodesWithTwoChild(TreeNode root){
    if (root == null){
        return 0;
    }

    else if(root.left != null + root.right != null){
        return 1 + countNodesWithTwoChild(root.left) + countNodesWithTwoChild(root.right);
    } 
    else{
        return  countNodesWithTwoChild(root.left) + countNodesWithTwoChild(root.right);
    }
}

}