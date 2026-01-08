package TwoDimensionalArray;


public class leetcode_transpose {
   public static void main(String[] args) {
    
    int[][] matrix = {{1,2,6},{3,4,5}};

    for (int i = 0; i <matrix[0].length ; i++) {
        for (int j = 0; j < matrix.length; j++) {
            System.out.print(matrix[j][i]+" ");
        }
        System.out.println();
    }

   }
}
