public class Node {
    private int data;
    private Node leftNode;
    private Node rightNode;

    public Node(int data) {
        this.data = data;
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
}
