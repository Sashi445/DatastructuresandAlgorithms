// Problem - 35
// https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {

    public static int searchInsertPosition(int[] nums, int target){

        int start = 0;
        int end = nums.length - 1;

        int mid = (start + end / 2);
        
        while(end > start){
            if (target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        
        return nums[mid] < target ? mid + 1 : mid;

    }

    public static void main(String[] args) {

        int[] targetValues = {5, 0, 7};

        for(int i = 0; i < targetValues.length; i++){
            int result = SearchInsertPosition.searchInsertPosition(new int[]{1, 3, 5, 6}, targetValues[i]);
            System.out.println(result);
        }
    }


}
