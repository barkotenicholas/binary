public class Node {
    private int data;
    private Node leftNode;
    private Node rightNode;

    public Node(int data) {
        this.data = data;
    }

    public Node getNode(int value){
        if(data == value){
            return this;
        }

        if(value < data){
            if(leftNode != null){
                return leftNode.getNode(value);
            }
        }else {
            if (rightNode != null){
                return rightNode.getNode(value);
            }
        }
        return null;
    }

    public int min(){
        if(leftNode == null){
            return data;
        }else {
            return leftNode.min();
        }

    }

    public int max(){
        if(rightNode == null){
            return data;
        }else {
            return rightNode.max();
        }
    }

    public void insert(int value) {

        if (value == data) {
            return;
        }
        if (value < data) {
            if (leftNode == null) {
                leftNode = new Node(value);
            } else {
                leftNode.insert(value);
            }
        } else {
            if (rightNode == null) {
                rightNode = new Node(value);
            } else {
                rightNode.insert(value);
            }
        }


    }

    public void inorder(){
        if(leftNode != null){
            leftNode.inorder();
        }
        System.out.print("Data =" + data+ ", ");

        if (rightNode != null){
            rightNode.inorder();
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }


    @Override
    public String toString() {
        return "Data => "+data;
    }
}
