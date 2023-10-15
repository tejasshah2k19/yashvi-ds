public class LinkedListDemo {
    Node head = null;
    Node last = null;

    void addNode(int num) {// 30

        if (head == null) {
            head = new Node();
            head.data = num;
            head.next = null;
            last = head;
        } else {
            Node tmp = new Node();
            tmp.data = num;
            tmp.next = null;
            last.next = tmp;
            last = tmp;
        }
    }

    void addBeg(int num) {
        Node tmp = new Node();
        tmp.data = num;
        tmp.next = head;
        head = tmp;
    }

    void display() {
        Node p = head;
        System.out.println("\nData :");
        while (p != null) {
            System.out.print(p.data + "->");// 10
            p = p.next;
        }
        System.out.println("");
    }

    void search(int data) {

    }

    public static void main(String[] args) {
        LinkedListDemo l = new LinkedListDemo();
        int num = 10;
        // 10 20 30 40
        l.addNode(10);
        l.addNode(20);
        l.addNode(30);
        l.display();
        l.addBeg(-5);
        l.display();
    }

}

class Node {
    int data; // data
    Node next;// next node address -> object
}