package Lista;

public class Node {

    private Integer var;
    private Node next;

    public Node(Integer var) {
        this.var = var;
        this.next = null;
    }

    public Node(Integer var, Node next) {
        this.var = var;
        this.next = next;
    }

    public Integer getVar() {
        return var;
    }
    public void setVar(Integer var) {
        this.var = var;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "var=" + var +
                ", next=" + next +
                '}';
    }
}