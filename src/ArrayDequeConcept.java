import java.util.ArrayDeque;

public class ArrayDequeConcept {
    public static void main(String[] args) {
        ArrayDeque aq = new ArrayDeque();
        aq.add("Seeni");
        aq.add(2);
        System.out.println(aq);
        aq.add(true);
        aq.offer('a');
        System.out.println(aq);
        aq.poll();
        System.out.println(aq);
        System.out.println(aq.peek());
        aq.remove();
        System.out.println(aq);
        aq.addFirst(12);
        aq.addLast(40);
        System.out.println(aq);
        aq.add(null);
        System.out.println(aq);
    }
}
