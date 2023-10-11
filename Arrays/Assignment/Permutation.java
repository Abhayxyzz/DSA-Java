

public class Permutation{
   public static int[] Arrays(int[] nums){
    int[] result = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
        result[i] = nums[nums[i]];
        
    }
    return result;
   } 
   public static void main(String[] args) {
    int[] nums = {0, 1, 3, 4, 2};
    int[] result = Arrays(nums);
    for (int num : result) {
        System.out.print(num + " ");
        
    }
   }
}