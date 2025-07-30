public class Diagonalsum {
    public static int diagonalSum(int num[][]){
        int sum=0;
        for(int i=0;i<num.length;i++){
            for (int j=0;j<num.length;j++) {
                if (i==j) {
                    sum+=num[i][j];
                }
                else if ((i+j)==num.length-1) {
                    sum+=num[i][j];
                }  
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};            //{1,2,3,4},{5,6,7,8,},{9,10,11,12},{13,14,15,16}
        System.out.print(diagonalSum(matrix));
    }
}
