package sorting;
public class countingsort {
    public static void countingSort(int [] num){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
           largest=Math.max(largest,num[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<num.length;i++){
            count[num[i]]++;
        }

        //sorting
        int j=0;
        for (int i=0; i<count.length; i++) {
            while(count[i]>0){
                num[j]=i;
                j++;
                count[i]--;
            }
        }
      
        //printarray
        for (int i=0; i<num.length; i++) {
            System.out.print(num[i]+" ");
        }

    }
    public static void main(String[]args){ 
        int arr[]={6,8,5,4,1,3,2,10};
        countingSort(arr);     
    }
}
