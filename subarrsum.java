public class subarrsum {
    public static void maxSubarraySum(int[]num){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;

        // this is brute force approach
        // for (int i= 0; i< num.length; i++) {   
        //     int start=i;
        //     for (int j = i; j < num.length; j++) {
        //     //     int end=j;
        //     //     currSum=0;
        //     //     for (int k=start;k<end;k++) {
        //     //         //subarraysum
        //     //         currSum+=num[k];
        //     //     }
        //     //     System.out.println(currSum);
        //     //     if (maxSum<currSum) {
        //     //         maxSum=currSum;  
        //     //     }
        //     }
        // }
        // System.out.println("maxSum="+ maxSum);

        // optimize prefix sum 
        int prefixSum []=new int [num.length];
        prefixSum[0]=num[0];
        //calculating arr
        for(int i=1;i<num.length;i++){
            prefixSum[i]=prefixSum[i-1]+num[i];

        }
        
        // calculating current sum 
        for(int i=0;i<num.length;i++){
            int start=i;

            for(int j=i;j<num.length;j++){
                int end =j;
                currSum = start==0  ? prefixSum[end]  :prefixSum[start-1];
               
                maxSum=(int)(Math.max(maxSum,currSum));
            }

        }
        System.out.println("maxSubarraySum=" +maxSum);
    }

    public static void main(String[] args) {
        int number[]={2,4,-6,-8,-10};
        maxSubarraySum(number);
    }
}
