public class largenumarr {
    public static int getlargest(int []num){
        int largest = Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
              largest=num[i];
            }  
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        System.out.println("smallest number is :"+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,8,10,11,14};
       
        System.out.println( "largest number is:" +getlargest(arr));
        
    }
}
