public class BinaryTree {

    Node root = null;

    Node addNode(Node root, int num) {// 100,300 , 200,300 , null,300
        if (root == null) {
            root = new Node(num);
            return root;
        } else if (num > root.data) {
            // right
            root.right = addNode(root.right, num);// null , 300
        } else if (num < root.data) {
            // left
            root.left = addNode(root.left, num);
        }
        return root;
    }

    void inOrder(Node root) {

        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    void preOrder(Node root) {

        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void postOrder(Node root) {

        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);

        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = tree.addNode(tree.root, 100);
        tree.addNode(tree.root, 200);
        tree.addNode(tree.root, 50);

        tree.addNode(tree.root, 300);
        tree.addNode(tree.root, 90);
        tree.addNode(tree.root, 40);

        tree.inOrder(tree.root);
    }
}

class Node {
    int data;
    Node left, right;

    Node(int num) {
        data = num;
        left = null;
        right = null;
    }
}
