package test.task2;

import static test.task1.input.NumberInput.numberInput;
import static test.task2.create.CreateSuper.createSuper;

public class Test {
    public static void main(String[] args){
        int value=numberInput("value");
        if (value<0){
            return;
        }
        createSuper(value);
    }
}
