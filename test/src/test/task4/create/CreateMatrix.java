package test.task4.create;

import java.util.Random;

public class CreateMatrix {
    public static int[][] createMatrix(int dimension, int range){
        Random rand = new Random();
        int[][] result= new int[dimension][dimension];
        for(int i=0;i<dimension;i++){
            for(int j=0;j<dimension;j++){
                result[i][j]=rand.nextInt(range*2)-range;
            }
        }
        return result;
    }
}
