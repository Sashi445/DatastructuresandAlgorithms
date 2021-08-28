public class SortingAlgorithms{

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void main(String[] args) {
        int[] nums = {8, 3, 2, 9,  1};
        SortingAlgorithms.selectionSort(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]);   
        }
    }

}