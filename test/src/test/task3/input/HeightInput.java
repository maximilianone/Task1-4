package test.task3.input;
import test.task1.input.NumberInput;

public class HeightInput {
    public static int heightInput(){
        int height=test.task1.input.NumberInput.numberInput("height");
        if (height<1||height>9){
            System.out.println("Invalid height");
            return -1;
        }
        return height;
    }
}
