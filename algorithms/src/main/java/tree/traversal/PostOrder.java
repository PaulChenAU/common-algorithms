package tree.traversal;

public class PostOrder{

    /**
     * preorder: root -> left -> right
     *
     * Dfs traversal: time complexity: O(n+m)
     * n is the number of nodes
     * m is the number of edges
     *
     * https://stackoverflow.com/questions/4547012/complexities-of-binary-tree-traversals/
     * 4547029#:~:text=7%20Answers&text=In%2Dorder%2C%20Pre%2Dorder,Graph%2C%20the%20same
     * %20applies%20here.
     * The number of total edges in a binary tree is n-1, where n is the number of nodes
     *
     * The time complexity then becomes O(n+n-1) = O(n)
     * @param root
     */
    public static void PostOrderTraversal(Node root){
        if(root == null){
            return;
        }

        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.println(root.val);
    }

    public static void main(String[] args) {
        Node n6 = new Node(6,null,null);
        Node n5 = new Node(5,null,null);
        Node n4 = new Node(4,n6,null);
        Node n3 = new Node(3,null,null);
        Node n2 = new Node(2,null,n5);
        Node n1 = new Node(1,n3,n4);
        Node root = new Node(0,n1,n2);

        PostOrderTraversal(root);
    }
}
