import java.util.LinkedList;
import java.util.Scanner;

public class ArrayListConcept {
    public static void main(String[] args) {
        LinkedList<String> Items = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many name u need to add :");
        int a= sc.nextInt();
        System.out.println("Enter the car names");
        for(int i =0;i<a;i++)
        {
            String s = sc.nextLine();
            Items.add(s);
        }
        System.out.println(Items);






    }
}
