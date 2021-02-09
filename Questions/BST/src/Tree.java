public class Tree<T> {
    T value;
    Tree<T> left;
    Tree<T> right;

    Tree(T x) {
        this.value = x;
    }

    Tree<T>  addLeft(T data){
        left = new Tree<T> (data);
        return left;
    }

    Tree<T>  addRight(T data){
        right = new Tree<T> (data);
        return right;
    }

    void inOrderTraversal(Tree<T> node){
        if(node != null){
            inOrderTraversal(node.left);
            System.out.print(" " +node.value);
            inOrderTraversal(node.right);
        }
        return;
    }

    boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
        //If just one of left or right was null, then it was not a child node and false can be returned safely
        if(t == null) return false;

        //If this is a child AND sum is input, then we have a path
        if(t.left == null && t.right == null) {
            return (s == t.value);
        }

        return hasPathWithGivenSum(t.left, s-t.value) || hasPathWithGivenSum(t.right, s-t.value);
    }

}

