import java.util.Scanner;
import java.util.Arrays;

public class practice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // // int[] arr = new int[5];
        // // arr[0] = 10;
        // // arr[1] = 14;
        // // arr[2] = 12;
        // // arr [3] = 23;
        // // arr[4] = 6;

        // System.out.println(arr[2]);

        // Array of objects
        // String[] str = new String[5];
        // for(int i = 0; i < str.length; i++) {
        //     str[i] = in.next();
        // }
        
        // System.out.println(Arrays.toString(str));

        // Passing in functions
        int[] nums = {1,2,6,9};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[0] = 99;
    }

    }
