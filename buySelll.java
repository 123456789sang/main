public class buySelll {
  
        public static int buyAndsellstocks(int num[]){
            int buyPrice=Integer.MAX_VALUE;
            int maxProfit=0;
            for (int i = 0; i < num.length; i++) {
                if(buyPrice<num[i]){
                    int profit=num[i]-buyPrice;//today's prices
                    maxProfit=Math.max(maxProfit,profit);
                }
                else{
                    buyPrice=num[i];
                }
            }
            return maxProfit;
        }
        public static void main(String[] args) {
            int prices[]={7,1,5,3,6,9};//[7,6,4,3,1]
            System.out.println(buyAndsellstocks(prices));
        }
        
     
}
