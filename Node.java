public class Node {
    //数据域
    public Object data;

    //指针域，指向下一个节点
    public Node next;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}
