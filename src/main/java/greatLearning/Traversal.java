package greatLearning;

class Node {
    char key;
    Node left, right;

    Node(char key) {
        this.key = key;
    }
}

class TreeTraversal {
    Node root;

    void preorderTraversal(Node n) {
        if (n != null) {
            System.out.print(n.key + " ");
            preorderTraversal(n.left);
            preorderTraversal(n.right);
        }
    }

    void postorderTraversal(Node n) {
        if (n != null) {
            preorderTraversal(n.left);
            preorderTraversal(n.right);
            System.out.print(n.key + " ");
        }
    }

    void inorderTraversal(Node n) {
        if (n != null) {
            preorderTraversal(n.left);
            System.out.print(n.key + " ");
            preorderTraversal(n.right);
        }
    }

}


public class Traversal {
    public static void main(String[] args) {
        TreeTraversal t1 = new TreeTraversal();
        t1.root = new Node('A');
        t1.root.left = new Node('B');
        t1.root.right = new Node('C');
        t1.root.left.left = new Node('D');
        t1.root.left.right = new Node('E');
        System.out.print("preorder  : ");
        t1.preorderTraversal(t1.root);
        System.out.println();
        System.out.print("postorder : ");
        t1.postorderTraversal(t1.root);
        System.out.println();
        System.out.print("inorder   : ");
        t1.inorderTraversal(t1.root);


    }
}
