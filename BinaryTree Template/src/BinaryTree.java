public class BinaryTree {
    Node root;

    public void addNode(int key) {
        Node newNode = new Node(key);

        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;
            /* while true, we set parent node to focusNode, if the key is less than the current node's key,
             * we set focusNode to leftChild and if that is null we set the parent's left child to newNode
             * and return. Opposite for if larger
             */
            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    /* check left side, null, jump back up and print, check right side, if not null, check left, jump back up when null,
     * print and continue doing so... (i.e print upon reaching node 2nd time)
     */
    public void inOrderTraversal(Node focusNode){
        if(focusNode!=null){
            inOrderTraversal(focusNode.leftChild);
            System.out.print(focusNode.key + " ");
            inOrderTraversal(focusNode.rightChild);
        }
    }
    /* starts from root, prints, move down to leftChild, print, move to right child, print, jump back up, already printed and
     * traversed, move down to right and do the same.
    */
    public void preOrderTraversal(Node focusNode){
        if(focusNode!=null){
            System.out.print(focusNode.key + " ");
            preOrderTraversal(focusNode.leftChild);
            preOrderTraversal(focusNode.rightChild);
        }
    }
    /* move down to left child, the right child, upon reaching focus node for last time, print focus node and continue to do
     * the same.
     */
    public void postOrderTraversal(Node focusNode){
        if(focusNode!=null){
            postOrderTraversal(focusNode.leftChild);
            postOrderTraversal(focusNode.rightChild);
            System.out.print(focusNode.key + " ");
        }
    }
}
