package ss10.prac.array_linked_list_fake;

import java.util.LinkedList;

public class MyLinkedList<E> {
    private class Node {
        private Node next = null;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head = null;
    private int numNodes = 0;

    public MyLinkedList() {
    }

    public void add(int index, E element) {
        if (head == null) {
            addFirst(element);
            return;
        }
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(temp.data);
        temp.next.data = e;
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node nodeToRemove = temp.next;
        E removedData = (E) nodeToRemove.data;
        temp.next = nodeToRemove.next;
        numNodes--;
        return removedData;
    }

    public boolean remove(Object e) {
        Node temp = head;
        Node previousNode = head;
        do {
            if (temp.data.equals(e)) {
                previousNode.next = temp.next;
                return true;
            } else {
                previousNode = temp;
            }
        } while (temp.next != null);
        return false;
    }

    public int size() {
        return numNodes;
    }

    @Override
    public Object clone() {
        MyLinkedList<E> clone = new MyLinkedList<>();
        for (Node x = head; x != null; x = x.next)
            clone.add((E) x.data);
        return clone;
    }

    public boolean contains(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        return true;
    }

    public E get(int i) {
        Node temp = head;
        for (int j = 0; j < i; j++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        return (E) head.data;
    }

    public E getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void clear() {
        head = null;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
