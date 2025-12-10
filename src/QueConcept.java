import java.util.PriorityQueue;

public class QueConcept {
    public static void main(String[] args) {
        PriorityQueue<String> obj = new PriorityQueue<>();
        obj.offer("Seeni");
        obj.offer("Sabari");
        obj.offer("Kitty");
        obj.offer("Rahul");
        System.out.println(obj);
        System.out.println(obj.poll());
        System.out.println(obj.peek());
        System.out.println(obj);
        obj.remove();
        System.out.println(obj);
    }
}

