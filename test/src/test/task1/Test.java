package test.task1;
import static test.task1.input.NumberInput.numberInput;
import static test.task1.conversion.NumberConversion.numberConversion;

public class Test{

    public static void main(String[] args){
        int value = numberInput("value");
        if (value<0){
            return;
        }
        numberConversion(value,2);
        numberConversion(value,8);
        numberConversion(value,16);
    }
}

