public class MaxHeap {

    private void maxHeapify(int[] a, int index, int heapSize) {

        int left = index == 0 ? 1 : 2 * index;
        int right = index == 0 ? 2 : 2 * index + 1;

        int largestIndex = 0;

        if ( left  <  heapSize && a[index] < a[left]){
        
            largestIndex = left;
        
        }else{
        
            largestIndex = index;
        
        }

        if ( right < heapSize && a[largestIndex] < a[right]) {
            
            largestIndex = right;

        }
 
        if (largestIndex != index) {

            int temp = a[index];

            a[index] = a[largestIndex];

            a[largestIndex] = temp;

            maxHeapify(a, largestIndex, heapSize);

        }
    }

    public void buildMaxHeap(int[] a) {
        for (int i = a.length / 2; i >= 0; i--) {
            maxHeapify(a, i, a.length);
        }
    }

    public void heapSort(int [] a){
        
        buildMaxHeap(a);
        
        for (int i = a.length - 1; i > 0 ; i--) {

            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            maxHeapify(a, 0, i);
        }

    }

    public static void main(String[] args) {

        MaxHeap maxHeap = new MaxHeap();

        int[] a = new int[] { 8, 2, 10, 1, 3 };

        maxHeap.heapSort(a);

        for (int num : a) {
            System.out.printf("%d ", num);
        }

    }
}