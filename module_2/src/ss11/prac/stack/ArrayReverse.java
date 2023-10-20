package ss11.prac.stack;

import java.util.Stack;

public class ArrayReverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push((int) Math.floor(Math.random() * 20));
        }
        System.out.println(stack);
        int stackSize = stack.size();
        Stack<Integer> reverseStack = new Stack<>();
        for (int i = 0; i < stackSize; i++) {
            reverseStack.push(stack.peek());
            stack.pop();
        }
        System.out.println(reverseStack);

        String string = "The coffin meme game like why Lia is so weird ICANT.";
        Stack<String> reverseString = new Stack<>();
        String[] stringArray = string.split(" ");
        for (String ele : stringArray) {
            reverseString.push(ele);
        }
        string = "";
        while (!reverseString.empty()) {
            string += reverseString.peek() + " ";
            reverseString.pop();
        }
        System.out.println(string);
    }
}
