public class Example2 {
    public static void main(String[] args) {
        /*int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 4;
        matrix[0][2] = 5;
        matrix[1][0] = 7;
        matrix[1][1] = 8;
        matrix[1][2] = 1;
        matrix[2][0] = 2;
        matrix[2][1] = 3;
        matrix[2][2] = 4;*/
        int[][] matrix = new int[][]{
                {1, 4, 5, 8},
                {7, 8, 1, 8},
                {2, 3, 4, 20}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
