package sorting;
public class selectionsort {
    public static void printArray(int num[]){
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,1,2};
        for (int i = 0; i< arr.length; i++) {
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[min]>arr[j]) {
                    min=j;
                }
            }
            //swap
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);
    }
    
}
