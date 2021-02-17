package collections;

import java.util.Stack;

/**Last-In-First-Out*/

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(9);
        stack.push(4);
        stack.push(5);
        System.out.println("Текущий стек: " + stack);
        System.out.println("Удаляем: " + stack.pop());
        System.out.println("Удаляем: " + stack.pop());
        System.out.println("Удаляем: " + stack.pop());
        System.out.println("Текущий стек: " + stack);
    }
}
