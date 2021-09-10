public class MaxSumSubArray{
    
    public static int findMaxSubArraySum(int[] a, int subArraySize){
        
        int maxSubArraySum = -100;
        

        // Sliding window technique
        for (int i=0; i<a.length - subArraySize + 1; i++){
            int sum = 0;
            for(int j=i; j < subArraySize + i; j++){
                sum += a[j];
            }
            if(sum > maxSubArraySum){
                maxSubArraySum = sum;
            }
        }

        return maxSubArraySum;

    }
    
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int subArraySize = 3;
        int result = MaxSumSubArray.findMaxSubArraySum(a, subArraySize);
        System.out.println(result);
    }
}