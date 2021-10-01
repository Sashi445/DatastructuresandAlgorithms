public class TwoPointerTechnique {
    
    public static int isPairSum(int[] nums, int target){

        int i = 0; 
        int j = nums.length - 1;

        while(i < j){

            if (nums[i] + nums[j]  == target){
                return 1;
            }

            else if (nums[i] + nums[j] < target ){
                i++;
            }

            else{
                j--;
            }

        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(TwoPointerTechnique.isPairSum(new int[]{ 3, 5, 9, 2, 8, 10, 11},  17));   
    }

}
