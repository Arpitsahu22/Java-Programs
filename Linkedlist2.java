class node {
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Linkedlist2 {
    public static void main(String[] args) {
        node n1 = new node(10);
        node n2 = new node(20);
        node n3 = new node(30);
        node n4 = new node(40);
        node n5 = new node(50);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        node head = n1;
        node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}