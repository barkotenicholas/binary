public class Tree {

    private Node root;


    public void insert(int value){

        if (root == null){
            root = new Node(value);
        }else root.insert(value);
    }

    public void inorder(){
        if (root != null) root.inorder();
    }

    public Node getRoot(int value){
        if (root != null){
            return root.getNode(value);
        }
        return null;
    }

    public int min(){
        if(root == null){
            return Integer.MIN_VALUE;
        }else {
            return root.min();
        }    }
    public int max(){
        if(root == null){
            return Integer.MAX_VALUE;
        }else {
            return root.max();
        }
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
