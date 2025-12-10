import java.util.Stack;

public class StackConcept {
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        System.out.println(s);
        System.out.println(s.peek());
        s.set(1,4);
        System.out.println(s);
    }
}
