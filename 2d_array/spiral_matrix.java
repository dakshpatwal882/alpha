import java.util.*;

class spiral_matrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int sr = 0;
        int sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;

        while (sr <= er && sc <= ec) {

            // top
            for (int j = sc; j <= ec; j++) {
                ans.add(matrix[sr][j]);
            }

            // right
            for (int i = sr + 1; i <= er; i++) {
                ans.add(matrix[i][ec]);
            }

            // bottom
            if (sr != er) {
                for (int j = ec - 1; j >= sc; j--) {
                    ans.add(matrix[er][j]);
                }
            }

            // left
            if (sc != ec) {
                for (int i = er - 1; i >= sr + 1; i--) {
                    ans.add(matrix[i][sc]);
                }
            }

            sr++;
            sc++;
            er--;
            ec--;
        }

        return ans;
    }
    public static void main(String[] args) { int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        spiral_matrix obj = new spiral_matrix();

        System.out.println(obj.spiralOrder(matrix));
        
    }
} 