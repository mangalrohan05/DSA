class Node {
    Node prev;
    int data;
    Node next;

    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this(null, data, null);
    }
}