public class ArrayQueue<E> implements Queue<E> {
    
    public static final int CAPACITY = 1000;      // default array capacity
    private E[] data;                             // generic array used for storage
    private int f = 0;                            // index of the front element
    private int sz = 0;                           // current number of elements

    public ArrayQueue() {this(CAPACITY);}         // constructs queue with default capacity

    @SuppressWarnings({"unchecked"})
    public ArrayQueue(int capacity) {             // constructs queue with given capacity
        data = (E[]) new Object[capacity];          // safe cast; compiler may give warning
    }

    @Override
    public int size() { return sz; }

    @Override
    public boolean isEmpty() { return (sz == 0); }

    @Override
    public void enqueue(E e) throws IllegalStateException {
        if (sz == data.length) throw new IllegalStateException("Queue is full");
        int avail = (f + sz) % data.length;   // use modular arithmetic
        data[avail] = e;
        sz++;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return data[f];
    }

    /**
     * Removes and returns the first element of the queue.
     * @return element removed (or null if empty)
     */
    @Override
    public E dequeue() {
        if (isEmpty()) return null;
        E answer = data[f];
        data[f] = null;                             // dereference to help garbage collection
        f = (f + 1) % data.length;
        sz--;
        return answer;
    }

}
