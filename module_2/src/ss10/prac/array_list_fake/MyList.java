package ss10.prac.array_list_fake;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            this.elements = new Object[capacity];
        } else if (capacity == 0) {
            this.elements = null;
        } else {
            System.out.println("Illegal Capacity: " +
                    capacity);
        }
    }

    public void add(int index, E element) {
        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        E removedElement = (E) elements[index];
        if (size <= 0 || index > size - 1) {
            System.out.println("Illegal removal activity");
        } else {
            System.arraycopy(elements, index + 1, elements, index, size - index - 1);
            elements[size - 1] = null;
            size--;
        }
        return removedElement;
    }

    public int size() {
        return size;
    }

    @Override
    public MyList clone() {
        MyList<E> cloneCopy = new MyList<>(size);
        cloneCopy.elements = Arrays.copyOf(elements, size);
        return cloneCopy;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elements[i]))
                    return i;
        }
        return -1;
    }

    public boolean add(E e) {
        ensureCapacity(elements.length + 1);
        elements[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void clear() {
        System.out.println("size: " + size);
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        String result = "";
        for (Object e : elements) {
            if (e != null) {
                result += e.toString() + " ";
            }
        }
        return result;
    }

}
