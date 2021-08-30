public class MergeSort{

    public static void merge(int[] arr, int start, int mid, int end){
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0; i<n1; i++){
            left[i] = arr[start + i];
        }

        for(int i=0; i<n2; i++){
            right[i] = arr[mid + i];
        }

        int i=0;
        int j=0; 
        int k=0;

        while(i < n1 &&  j < n2){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k++] = left[i++];
        }

        while(j<n2){
            arr[k++] = right[j++];
        }
    }

    public static void sort(int[] arr, int start, int end){
        if(end > start){
            int mid = start + (end - start) / 2;
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }


    public static void main(String[] args) {
        int[] arr = {8, 3, 2, 9,  1};
        MergeSort.sort(arr, 0, arr.length-1);
        for(int num : arr){
            System.out.print(num);
        }
    }
    
}