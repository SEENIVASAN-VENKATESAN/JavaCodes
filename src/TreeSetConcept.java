import java.util.TreeSet;

public class TreeSetConcept {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(131);
        ts.add(1);
        ts.add(11);
        ts.add(13);
        System.out.println(ts);
        ts.remove(131);
        System.out.println(ts);
        System.out.println(ts.last());
        System.out.println(ts.first());
        ts.contains(2);
        System.out.println(ts.floor(3));
        System.out.println(ts.ceiling(10));
        ts.clear();
      
    }
}
