public class LinkedStack<E> implements Stack<E> {
    
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();   // an empty list

    public LinkedStack() { }                   // new stack relies on the initially empty list

    @Override
    public int size() { return list.size(); }

    @Override
    public boolean isEmpty() { return list.isEmpty(); }

    @Override
    public void push(E element) { list.addFirst(element); }

    @Override
    public E top() { return list.first(); }

    @Override
    public E pop() { return list.removeFirst(); }

    }
 }
