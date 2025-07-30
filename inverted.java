public class inverted {
    public static void halfrotatedPryamid(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){  //space
                System.out.print(" ");

            }

              //star

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
   }
   public static void main(String[] args) {
         int n=5;
     halfrotatedPryamid(n);    
   }
}
