public class kadanalgo {
    public static void kadan(int []arr){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for (int i = 0; i < arr.length; i++) {
            //for all cases
            cs=Math.max(arr[i], cs+arr[i]);// Continue the current subarray

            // if (cs<0) { only for both mix +ve and -ve
            //     cs=0;  
            // }
            ms=Math.max(ms,cs);
        }
        System.out.println("our max subarray sum is :"+ms);
    } 
           
    public static void main(String[] args) {
        int number[]={-2,-4,-6,-8,-10};
        kadan(number);
    } 
}    
   