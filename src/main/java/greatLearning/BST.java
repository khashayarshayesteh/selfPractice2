package greatLearning;

class BinarySolution {
    Node root;

    void insertKey(char key) {
        root = insertInTree(root, key);
    }

    Node insertInTree(Node root, char key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertInTree(root.left, key);
        } else if (key > root.key) {
            root.right = insertInTree(root.right, key);
        }
        return root;
    }
    void preorderTraversal(Node root){
if(root!= null){
    System.out.print(root.key + " ");
    preorderTraversal(root.left);
    preorderTraversal(root.right);
}
    }
}

public class BST {
    public static void main(String[] args) {

        BinarySolution t1 = new BinarySolution();
        t1.insertKey('C');
        t1.insertKey('I');
        t1.insertKey('B');
        t1.insertKey('G');
        t1.insertKey('M');
        t1.insertKey('A');

        t1.preorderTraversal(t1.root);
    }
}
