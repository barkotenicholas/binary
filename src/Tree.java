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


    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
