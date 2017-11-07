package test.task3.build;

import java.util.Arrays;

public class BuildTriangle {
    public static int[][] buildTriangle(int height){
        int[][] result = new int[height][];
        for (int i=0; i<height;i++){
            int count=0;
            result[i]=new int[(1+i)*2-1];
            for(int j=0; j<result[i].length;j++) {
                result[i][j]=1+count;
                if(j>i-1){
                    count--;
                    continue;
                }
                count++;
            }
            System.out.println(Arrays.toString(result[i]));
        }
        return result;
    }
}
