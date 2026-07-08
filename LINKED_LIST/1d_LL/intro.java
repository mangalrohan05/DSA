class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        data = data1;
        next = next1;
    }

    Node(int data1){
        data = data1;
        next = null;
    }
}

class intro{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6};

        Node y = new Node(arr[0]);
        System.out.println(y);
        System.out.println(y.data);
        System.out.println(y.next);
    }
}