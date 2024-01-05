public interface Stack<E> {

    int size(); // Returns the number of elements in the stack

    boolean isEmpty(); // Tests whether the stack is empty

    void push(E e); // Inserts an element at the top of the stack

    E top(); // Returns, but does not remove, the element at the top of the stack

    E pop(); //Removes and returns the top element from the stack
}
