package labs;
import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class Laba1 {

    public static int fact(int n){
        int f = 1;
        for (int i = 1; i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String args[]) {
        //System.out.println(fact(6));
        int i = 0;
        Laba1_4.foo();
       /* long a = -1000;
        long b = 2000;
        int i = 0;
        int[] arr = new int[10];

        //Num4
        for (i = 0; i<10;i++){
            arr[i] = (int) (Math.random()*(b-a) + a);
            System.out.print(i + "   ");
        }*/


        //Num2
        /*for (int k = 0; k < args.length; k++){
            System.out.println(String.format("Argument %d: %s", i, args[i]));
        }*/
        //Num3
        /*for (float j = 1; j < 11; j++){
            System.out.print(1./j + "  ");

        }*/
        //Num1
       /* int sum = 0, n = 10;

        Scanner s = new Scanner(System.in);
        int[] a = new int[n];

        System.out.println("Введите массив");

        while ( i < n) {
            a[i]=s.nextInt();
            sum=sum+a[i];
            i++;
        }
        s.close();
        for (i = 0; i< n; i++){
            a[i] = s.nextInt();
            sum+=a[i];
        }
        do {
            a[i]=s.nextInt();
            sum+=+a[i];
            i++;

        }while (i<n);

        System.out.println(sum);
            for (int k = 0; k <= 10; k++){
            a[i] = s.nextInt();
            sum += a[i];
        }*/
        /*for(i = args.length - 1 ; i >= 0 ; i--)
            System.out.println("Reverse : " + args[i]);
    }
*/


    }
}
