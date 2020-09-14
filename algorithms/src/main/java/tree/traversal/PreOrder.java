package tree.traversal;

public class PreOrder{

    /**
     * preorder: root -> left -> right
     * @param root
     */
    public static void preOrderTravelsal(Node root){
        if(root == null){
            return;
        }

        System.out.println(root.val);
        preOrderTravelsal(root.left);
        preOrderTravelsal(root.right);
    }

    public static void main(String[] args) {
        Node n6 = new Node(6,null,null);
        Node n5 = new Node(5,null,null);
        Node n4 = new Node(4,n6,null);
        Node n3 = new Node(3,null,null);
        Node n2 = new Node(2,null,n5);
        Node n1 = new Node(1,n3,n4);
        Node root = new Node(0,n1,n2);

        preOrderTravelsal(root);
    }
}
