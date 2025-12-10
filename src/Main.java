import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Main
{
    public static void main(String[] args) {
        List <String> Items = new ArrayList<>();
        Items.add("Seeni");
        Items.add("Sabari");
        Items.add("Kutty");
        Items.add("Ganesh");
        System.out.println(Items);
        Items.remove("Seeni");
        System.out.println(Items.isEmpty());
        System.out.println(Items);
        System.out.println(Items.remove("Kutty"));
        System.out.println(Items);
        System.out.println(Items.size());
        System.out.println(Items.set(1,"Kutty"));
        System.out.println(Items);

    }
}