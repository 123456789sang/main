package sorting;
public class searchinsortedarr {
    public static  boolean staircaseSearch(int num [][],int key){
        int Row=0,Col=num[0].length-1;
        while (Row<num.length&&Col>=0) {
            if (num[Row][Col]==key) {
                System.out.printf("found key at index ("+Row+ " ," +Col+")");
                return true;
            }
            else if (key<num[Row][Col]) {
                Col--;
            } else {
                Row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key =32;
        staircaseSearch(matrix,key);
    }
}
