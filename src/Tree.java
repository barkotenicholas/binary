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

    public void delete(int value){
        root = delete(root, value);
    }

    private Node delete(Node subTreeRoot , int value){

        if (subTreeRoot == null){
            return subTreeRoot;
        }
        if(value < subTreeRoot.getData()){
            subTreeRoot.setLeftNode(delete(subTreeRoot.getLeftNode(),value));
        } else if (value > subTreeRoot.getData()) {
            subTreeRoot.setRightNode(delete(subTreeRoot.getRightNode(),value));
        }else {
            // case 1 and 2
            if(subTreeRoot.getLeftNode() == null){
                return subTreeRoot.getRightNode();
            } else if (subTreeRoot.getRightNode() == null) {
                return subTreeRoot.getLeftNode()
            }
            //case3

            subTreeRoot.setData(subTreeRoot.getRightNode().min());
            subTreeRoot.setRightNode(delete(subTreeRoot.getRightNode(), subTreeRoot.getData()));
        }

        return subTreeRoot;

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
