package test.task3;

import static test.task3.build.BuildTriangle.buildTriangle;
import static test.task3.input.HeightInput.heightInput;

public class Test {
    public static void main(String[] args){
        int height=heightInput();
        if (height<0){
            return;
        }
        buildTriangle(height);
    }
}
