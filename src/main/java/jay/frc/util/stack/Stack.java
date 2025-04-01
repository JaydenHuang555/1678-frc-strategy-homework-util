package jay.frc.util.stack;

public class Stack<T> {

    Node head, tail;

    public Stack(){}

    public void push(T item) {
        Node node = new Node(item);
        if(head == null) {
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail.next.prev = tail;
            tail = tail.prev;
        }
    }
    @SuppressWarnings("unchecked")
    public T peek(){
        return (T)tail.val;
    }

    public T pop() {
        T ret = peek();
        if(tail == head) {
            head = null;
            tail = null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
        }
        return ret;
    }

    public boolean isEmpty() {
        return head == null;
    }

}
