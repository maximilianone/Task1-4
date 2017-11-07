package test.task4.rotate;

public class RotateMatrix {
    public static int[][] rotateMatrix(int[][] matrix){
        int dimension=matrix.length;
        int[][] result= new int[dimension][dimension];
        for(int i=0;i<dimension;i++) {
            for (int j = 0; j < dimension; j++) {
                result[i][j]=matrix[j][dimension-1-i];
            }
        }
        return result;
    }

}
