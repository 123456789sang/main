public class Trappingrain {
    public static int trapingrainWater(int []num){
        // calculate left maxboundary
        int n=num.length;
        int leftmax[]=new int [n];
        leftmax[0]=num[0];
        for(int i=1;i<num.length;i++){
            leftmax[i]=Math.max(num[i],leftmax[i-1]);

        }
        // calculate right maxboundary
        int rightmax[]=new int[n];
        rightmax[n-1]=num[n-1];
        for(int j=n-2;j>=0;j--){
            rightmax[j]=Math.max(num[j],rightmax[j+1]);
        }
        // loop
        int trappedwater=0;
        for (int i = 0; i < n; i++) {
            //waterlavel
            int waterlevel=Math.min(leftmax[i],rightmax[i]); 
            //trappedWater 
            trappedwater+=waterlevel-num[i];
        }
       
        return trappedwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};//[4,2,0,3,2,5]
        System.out.println(trapingrainWater(height));
    }
    
}
