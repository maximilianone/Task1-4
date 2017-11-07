package test.task4;

import java.util.Arrays;

import static test.task4.create.CreateMatrix.createMatrix;
import static test.task4.rotate.RotateMatrix.rotateMatrix;

public class Test {
    public static void main(String[] args){
            int[][] matrix = createMatrix(4,10);
            System.out.println("New Matrix:");
            for (int [] row:matrix) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println("Rotated Matrix:");
            for (int [] row:rotateMatrix(matrix)) {
                System.out.println(Arrays.toString(row));
            }

    }
}
