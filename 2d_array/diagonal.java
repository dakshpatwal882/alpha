public class diagonal {
    public int diagonalSum(int[][] matrix) {
        int sum=0;
        for (int i=0 ; i<matrix.length;i++)
        {
            //primary diagonal
            sum+= matrix[i][i];
            //sec diagonal
            if (i!=matrix.length-1-i){
            sum+= matrix[i][matrix.length-1-i];
              }
        }return sum;
    }
    public static void main(String[] args) {
        int matrix [][] = {
            {1,2,3},
            {4,5,6,},
            {7,8,9},
        };
        diagonal obj = new diagonal();
        System.out.println(obj.diagonalSum(matrix));
    }
}

