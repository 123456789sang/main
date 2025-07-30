package searching;
public class binarysearch {
    public static int binarySearch(int []num,int value){
        int start =0,end=num.length-1;
        while (start<=end) {
            int mid=(start+end)/2;//mid
            if (num[mid]==value) {
                return mid;
            }
            if (num[mid]<value) {
                start=mid+1;      //right
            }
            else{
               end=mid-1;  //left  
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int number[]={2,4,6,8,10,12,14};
        int key=14;
        // int index= binarySearch(number,key);
        // if (index==-1) {
        //     System.out.println("key is not found");
        // }
        // else{
        //     System.out.println("the key index:"+index);
        // }
        System.out.println("key at index :"+binarySearch(number, key));
    }
    
}
