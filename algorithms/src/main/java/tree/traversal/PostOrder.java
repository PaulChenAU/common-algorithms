package tree.traversal;

import java.util.Stack;

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

    /**
     * since the sequence of post order traversal is left->right->root
     * we can use two stacks
     * The first stack implements root->right->left traversal and we pop
     * all the elements to the second stack
     * From the second stack we can get left->right->root traversal
     *
     * @param root
     */
    public static void PostOrderTraversalNonRecursive(Node root){
        Stack<Node> stacka = new Stack<>();
        Stack<Node> stackb = new Stack<>();

        stacka.push(root);
        while (!stacka.isEmpty()){
            Node node = stacka.pop();

            stackb.push(node);
            if(node.left != null){
                stacka.push(node.left);
            }

            if(node.right != null){
                stacka.push(node.right);
            }
        }

        while (!stackb.isEmpty()){
            Node node = stackb.pop();
            System.out.println(node.val);
        }

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
        System.out.println("================");
        PostOrderTraversalNonRecursive(root);
    }
}
