package ss10.prac.array_list_fake;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<>();
        integerMyList.add(1);
        integerMyList.add(10);
        integerMyList.add(5);
        integerMyList.add(1, 25);
        System.out.println(integerMyList);
        integerMyList.remove(2);
        System.out.println(integerMyList);
        MyList cloneCheck;
        cloneCheck = integerMyList.clone();
        System.out.println("Clone: " + cloneCheck);
        integerMyList.clear();
        System.out.println("This should be empty: " + integerMyList);
    }
}
