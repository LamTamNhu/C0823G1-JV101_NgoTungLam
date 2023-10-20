package ss10.prac.array_linked_list_fake;

import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add(0, "Hello");
        linkedList.addLast("My");
        linkedList.addLast("Test");
        linkedList.add(1, "Friend");

        linkedList.printList();
    }
}
