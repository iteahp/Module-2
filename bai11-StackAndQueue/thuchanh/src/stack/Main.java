package stack;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.add(5);
        stack.add(6);
        stack.add(7);
        stack.add(8);
        stack.add(9);
        stack.show();
        stack.pop();
        stack.show();
        System.out.println(stack.get());
    }
}
