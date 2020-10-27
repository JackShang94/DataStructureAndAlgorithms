import java.util.*;

public class SingleLinkedList {
    private Node head;
    private int size;

    //单向链表构造函数
    public SingleLinkedList(){
        head = null;
        size = 0;
    }

    //基础方法
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }

    public void append(Object data){ // 插入尾部
        Node newNode = new Node(data);
        if(head == null){ 
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        size ++;
    }
    
    public void insert(int index, Object data){ //指定位置插入
        Node newNode = new Node(data);
        if(head == null){ 
            head = newNode;
            return;
        }
        Node pre = head;
        Node temp = head.next;
        int j = 0;
        while(temp != null && j < index){
            pre = temp;
            temp = temp.next;
            j++;
        }
        newNode.next = null;
        pre.next = newNode;
        size++;
    }
    
    public Object pop(){
        if(head == null){
            return null;
        }
        Node pre = head;
        Node temp = head.next;
        int j = 0;
        while(temp != null && j < size){
            pre = temp;
            temp = temp.next;
            j++;
        }
        pre.next = null;
        size--;
        return pre.data;
    }

    public Object delete(int index){
        if (index < 1 || index > size) {
            return "Invalid Index";
        }

        if(head == null){
            return null;
        }

        if(head.next == null){
            size--;
            return head.data;
        }

        Node pre = head;
        Node temp = head.next;
        int j = 0;
        while(temp != null && j < index){
            pre = temp;
            temp = temp.next;
            j++;
        }
        pre.next = temp.next;
        return pre.data;
    }

    public Object getValue(int index){
        if (index < 1 || index > size) {
            return "Invalid Index";
        }

        if(head == null){
            return null;
        }

        if(head.next == null){
            return head.data;
        }

        Node temp = head.next;
        int j = 0;
        while(temp != null && j<index){
            temp = temp.next;
            j++;
        }
        return temp.data;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("");
        }else{
            if(head.next == null){
                System.out.println(head.data);
            }
            for(Node temp = head.next; temp != null; temp = temp.next){
                System.out.println(temp.data);
            }
        }
    }

}
