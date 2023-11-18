
package lab7;

import java.util.LinkedList;

public class LinkedStack<E> implements Stack<E> {
    private LinkedList<E> list;

    public LinkedStack() {
        list = new LinkedList<>();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        return list.removeFirst();
    }

    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }
        return list.getFirst();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
