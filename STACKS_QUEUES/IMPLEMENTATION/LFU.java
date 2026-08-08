import java.util.HashMap;

class LFUCache {
    class Node {
        int key;
        int value;
        int freq;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.freq = 1;
        }
    }

    class DLL {
        Node head;
        Node tail;
        int size;

        DLL() {
            head = new Node(0, 0);
            tail = new Node(0, 0);

            head.next = tail;
            tail.prev = head;
        }

        public void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;

            size--;
        }

        void addToTail(Node node) {
            node.prev = tail.prev;
            node.next = tail;

            tail.prev.next = node;
            tail.prev = node;

            size++;
        }

        Node removeHead() {
            if (size == 0)
                return null;

            Node node = head.next;
            remove(node);

            return node;
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    int capacity;
    int minFreq;

    HashMap<Integer, Node> KeyMap;
    HashMap<Integer, DLL> FreqMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;

        KeyMap = new HashMap<>();
        FreqMap = new HashMap<>();

    }

    public int get(int key) {
        if (!KeyMap.containsKey(key))
            return -1;

        Node node = KeyMap.get(key);

        increaseFreq(node);

        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0)
            return;

        if (KeyMap.containsKey(key)) {
            Node node = KeyMap.get(key);

            node.value = value;
            increaseFreq(node);
            return;
        }

        if (KeyMap.size() == capacity) {
            DLL minFreqList = FreqMap.get(minFreq);

            Node lruNode = minFreqList.removeHead();

            KeyMap.remove(lruNode.key);
        }

        Node newNode = new Node(key, value);

        KeyMap.put(key, newNode);

        FreqMap.computeIfAbsent(1, f -> new DLL()).addToTail(newNode);

        minFreq = 1;
    }

    public void increaseFreq(Node node) {
        int oldFreq = node.freq;

        DLL oldList = FreqMap.get(oldFreq);
        oldList.remove(node);

        if (oldFreq == minFreq && oldList.isEmpty())
            minFreq++;

        node.freq++;

        FreqMap.computeIfAbsent(node.freq, f -> new DLL()).addToTail(node);
    }
}
