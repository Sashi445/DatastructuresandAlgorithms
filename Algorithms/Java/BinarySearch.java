import java.util.Arrays;

public class BinarySearch{

    private int binarySearchIterative(int[] a, int start, int end, int target){

        int mid = (start + end) / 2;

        while(end >= start){
            
            System.out.println(start + " " + end + " " + mid);
            
            if (a[mid] == target){
                return mid;
            }
            else if (target < a[mid]){
                end = mid;
            }else{
                start = mid + 1;
            }
            
            mid = (start + end) / 2; 
            
            System.out.println(start + " " + end + " " + mid);
        }

        return -1;
    }


    private int binarySearchRecursive(int[] a, int start, int end, int target){

        if(end >= start){

            int mid = (start + end) / 2;

            System.out.println(start + " " + end + " " + mid);

            if(target == a[mid]){
                return mid;
            }

            else if(target < a[mid]){
                return binarySearchRecursive(a, start, mid, target);
            }

            else{
                return binarySearchRecursive(a, mid+1, end, target);
            }
        }

        return -1;
    }



    public int binarySearch(int[] a, int target, boolean recursive){
        
        Arrays.sort(a);
        
        if (recursive){
            return binarySearchRecursive(a, 0, a.length - 1, target);
        }

        return binarySearchIterative(a, 0, a.length - 1, target);
    
    }

    
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.binarySearch(new int[]{1, 3, 5, 7, 12, 15, 16, 18}, 12, true);
        System.out.println(result);
    }

}