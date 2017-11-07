package test.task1.conversion;

public class NumberConversion {

    public static char[] numberConversion(int value, int base) {
        int[] arr = new int[32];
        int index = 0;

        while (value >= base) {
            arr[index] = value % base;
            value /= base;
            index++;
        }
        arr[index] = value;

        char[] result=new char[index+1];

        System.out.println();

        for(int i=0;i<result.length;i++){

            if(arr[index-i]<10) {
                result[i] = (char) (arr[index - i] + 48);
            }
            else{
                result[i]=(char) (arr[index-i]+87);
            }
            System.out.print(result[i]);
        }
        return result;
    }

}
