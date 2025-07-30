public class spiralmatrix {
    public static void printSpiral(int num[][]){
        int startRow=0;
        int startCol=0;
        int endRow=num.length-1;
        int endCol=num[0].length-1;
        
        while (startRow <= endRow && startCol <= endCol) {
            // Top row
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(num[startRow][i] + " ");
            }
            startRow++;

            // Right column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(num[i][endCol] + " ");
            }
            endCol--;

            // Bottom row
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    System.out.print(num[endRow][i] + " ");
                }
                endRow--;
            }

            // Left column
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(num[i][startCol] + " ");
                }
                startCol++;
            }
        
        } 
        System.out.println();

    }
    public static void main(String[] args){
       int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},
       {17,18,19,20}};
       printSpiral(matrix);
    }     
 
}
