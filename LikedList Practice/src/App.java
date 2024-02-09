/**
 * Represents a binary tree data structure.
 */
class BinaryTree {
    /**
     * Represents a node in the binary tree.
     */
    static class Node {
        int data;
        Node left, right;

        /**
         * Constructs a new node with the given value.
         * @param value the value of the node
         */
        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    Node root;

    /**
     * Checks if the binary tree satisfies the sum property.
     * The sum property states that for every node, the value of the node
     * should be equal to the sum of the values of its left and right child nodes.
     * @param node the root node of the binary tree
     * @return true if the binary tree satisfies the sum property, false otherwise
     */
    boolean isSumProperty(Node node) {
        if (node == null || (node.left == null && node.right == null)) {
            return true;
        }

        int leftSum = (node.left != null) ? node.left.data : 0;
        int rightSum = (node.right != null) ? node.right.data : 0;

        return (node.data == leftSum + rightSum) && isSumProperty(node.left) && isSumProperty(node.right);
    }
}

// Usage example
public class App {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new BinaryTree.Node(10);
        tree.root.left = new BinaryTree.Node(8);
        tree.root.right = new BinaryTree.Node(2);
        tree.root.left.left = new BinaryTree.Node(3);
        tree.root.left.right = new BinaryTree.Node(5);
        tree.root.right.right = new BinaryTree.Node(2);

        int result = tree.isSumProperty(tree.root) ? 1 : 0;
        System.out.println(result);
    }
}
