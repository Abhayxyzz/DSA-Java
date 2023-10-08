import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>(10);

    

        // list.add(67);
        // list.add(6547);
        // list.add(89);
        // list.add(56);

        // System.out.println(list.contains(67));

        // System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
            
        }
        System.out.println(list);


        
    }
}
