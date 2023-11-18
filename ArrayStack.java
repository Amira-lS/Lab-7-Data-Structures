
package lab7;


import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] data;
    private int size;

    public ArrayStack() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void push(E e) {
        if (size == data.length) {
            data = Arrays.copyOf(data, 2 * size);
        }
        data[size++] = e;
    }

    @Override
    public E pop() {
    if (isEmpty()) {
        return null;
    }
    E poppedElement = data[size - 1];
    data[size - 1] = null; // Set the top element to null
    size--;
    return poppedElement;
}




    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }
        return data[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (int j = 0; j < size; j++) {
        sb.append(data[j]);
        if (j < size - 1) {
            sb.append(", ");
        }
    }
    sb.append("]");
    return sb.toString();
}


}
