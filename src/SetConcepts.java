import java.util.HashSet;

public class SetConcepts {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(134);
        set.add("seeni");
        set.add(true);
        set.add('d');
        set.add(set.hashCode());
        set.add(1323);
        System.out.println(set);

    }
}
