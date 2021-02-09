public class TestBST {
    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        bst.addNode(3);
        bst.addNode(1);
        bst.addNode(5);
        bst.addNode(2);
        bst.addNode(4);

        bst.inOrderTraversal(bst.root);
        System.out.println();
        bst.preOrderTraversal(bst.root);
        System.out.println();
        bst.postOrderTraversal(bst.root);
    }
}
