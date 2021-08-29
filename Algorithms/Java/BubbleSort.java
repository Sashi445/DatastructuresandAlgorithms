public class BubbleSort {

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1 );
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 2, 9,  1};
        BubbleSort.sort((arr));
        for(int num : arr){
            System.out.print(num);
        }
    }
    
}
