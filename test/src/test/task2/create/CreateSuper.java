package test.task2.create;

public class CreateSuper {
    public static void createSuper(int value){
        for(int i=1;i<=value;i++) {
            int result = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    result += j;
                }
            }
           if (result==i){
                System.out.println(result);
            }
        }
    }

}
