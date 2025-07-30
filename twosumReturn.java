public class twosumReturn {

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    return new int[] {i,j};
                }
                   
            }
       }
        return new int[] {};
    }
    public static void main(String[] args) {
        int []arr={2, 3, 5,7,9};
        int sum=9;
        int[] result = twoSum(arr, sum);
        
        // Format the output to print the indices found
        if (result.length == 0) {
            System.out.println("No two sum solution found.");
        } else {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        }
        
    }
    
}
