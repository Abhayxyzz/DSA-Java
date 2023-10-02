import java.util.ArrayList;

public class ArraylistExample{
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(6547);
        list.add(89);
        list.add(56);

        System.out.println(list.contains(67));

        System.out.println(list);


        
    }
}
