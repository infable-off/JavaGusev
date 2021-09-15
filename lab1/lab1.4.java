package labs;

import java.util.Arrays;

public class Laba1_4 {
    public static void foo() {
        long a = -1000;
        long b = 2000;
        int i = 0;
        int[] arr = new int[10];

        //Num4
        for (i = 0; i<10;i++){
            arr[i] = (int) (Math.random()*(b-a) + a);
            System.out.print(arr[i] + "   " );
        }
        System.out.println("\n");
        Arrays.sort(arr);
        for (i = 0; i<10;i++){
            System.out.print(arr[i] + "   ");
        }


    }


}
