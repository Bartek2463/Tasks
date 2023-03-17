public class Matrix {
    public static int determinant(int [][] matrix){

        int row = matrix.length;
        int column = matrix[0].length;
        int [][] sum = new int[row][column];
        int [][] second = new int[row][column];
       


        for (int i = 0; i< matrix.length;i++) {


            for (int j = 0; j <matrix[i].length; j++) {

                sum[i][j]= matrix[i][j]-second[i][j];
//                System.out.print(matrix[i][j]);
            }
//            System.out.println();

            System.out.println(sum);
        }


            return 2;

    }
}
