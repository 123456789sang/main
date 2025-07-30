public class Reversearr {
    public static void reverseArray(int []num){
        int last=num.length-1;
        for(int i=0;i<last;i++){
            int temp=num[last];
            num[last]=num[i];
            num[i]=temp;
            last--;
        }
    }
    public static void main(String[] args) {
        int []number ={2,4,5,6,8};
        reverseArray(number);

        for(int i=0;i<number.length;i++){              //print reverse array 
            System.out.print(number[i]+" ");
        }
        
    }
    
}