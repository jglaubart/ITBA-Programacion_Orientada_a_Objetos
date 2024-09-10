package guia4.ej12_LinearList;

public class Node {
    private Object head;
    private Node tail;

    Node(Object head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public void setTail(Node tail){
        this.tail = tail;
    }

    public void setHead(Object head){
        this.head = head;
    }

    public Object getHead(){
        return head;
    }

    public Node getTail(){
        return tail;
    }
}
