public class BSTTest {
    public static void main(String[] args) {
       Tree<Integer> root = new Tree<>(4);
       Tree<Integer> left = root.addLeft(1);
       Tree<Integer> right = root.addRight(3);

       left.addLeft(-2);
       left.addRight(3);

       right.addLeft(1);
       right = right.addRight(2);

       right.addLeft(-2);
       right.addRight(-3);

       root.inOrderTraversal(root);
        System.out.println();
        System.out.println(root.hasPathWithGivenSum(root,7));
    }
}