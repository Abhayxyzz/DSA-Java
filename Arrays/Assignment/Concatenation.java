public class Concatenation{
    public static int[] Arrays(int[] nums){
        int[] result = new int[2*(nums.length)];

    for (int i = 0; i < nums.length; i++) {
        result[i] = nums[i];
        result[i + nums.length] = nums[i];
        
    }
    return result;
   } 
   public static void main(String[] args) {
    int[] nums = {0, 1, 5};
    int[] result = Arrays(nums);
    for (int num : result) {
        System.out.print(num + " ");
        
    }
   }

}