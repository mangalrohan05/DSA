
class BinaryHeap {
    static int capacity;
    static int size;

    static int[] arr;

    BinaryHeap(int cap) {
        capacity = cap;
        size = 0;

        arr = new int[capacity];
    }

    static int parent(int i) {
        return (i - 1) / 2;
    }

    static int left(int i) {
        return i * 2 + 1;
    }

    static int right(int i) {
        return (i * 2) + 2;
    }

    void Insert(int x) {
        if (size == capacity) {
            System.out.println("Overflow");
            return;
        }

        arr[size] = x;

        int k = size;
        size++;

        while (k != 0 && arr[parent(k)] > arr[k]) {
            int temp = arr[parent(k)];
            arr[parent(k)] = arr[k];
            arr[k] = temp;

            k = parent(k);
        }
    }

    static void Heapify(int ind) {
        int ri = right(ind);
        int le = left(ind);

        int min = ind;

        if (le < size && arr[le] < arr[min])
            min = le;
        if (ri < size && arr[min] < arr[ri])
            min = ri;

        if (min != ind) {
            int temp = arr[ind];
            arr[min] = arr[ind];
            arr[ind] = temp;

            Heapify(min);
        }

    }

    int getMin() {
        return arr[0];
    }

    int ExtractMin() {
        if (size <= 0)
            return Integer.MAX_VALUE;

        if (size == 1) {
            size--;
            return arr[0];
        }

        int min = arr[0];

        arr[0] = arr[size - 1];
        size--;

        Heapify(0);

        return min;
    }

    void DecreaseKey(int i, int val) {
        arr[i] = val;

        while (i != 0 && arr[parent(i)] > arr[i]) {
            int temp = arr[parent(i)];
            arr[parent(i)] = arr[i];
            arr[i] = temp;

            i = parent(i);
        }
    }

    void Delete(int i) {
        DecreaseKey(i, Integer.MIN_VALUE);
        ExtractMin();
    }

    static void print() {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        BinaryHeap h = new BinaryHeap(20);
        h.Insert(4);
        h.Insert(1);
        h.Insert(2);
        h.Insert(6);
        h.Insert(7);
        h.Insert(3);
        h.Insert(8);
        h.Insert(5);

        System.out.println("Min value is " + h.getMin());

        h.Insert(-1);
        System.out.println("Min value is " + h.getMin());

        h.DecreaseKey(3, -2);
        System.out.println("Min value is " + h.getMin());

        h.ExtractMin();
        System.out.println("Min value is " + h.getMin());

        h.Delete(0);
        System.out.println("Min value is " + h.getMin());
    }

}