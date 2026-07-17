package ARRAY;
import java.util.Scanner;
public class secondlargest {


    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        while (n < 0) {
            System.out.println("enter positive size");
            n = sc.nextInt();

        }


        System.out.println("enter array element");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            while (arr[i] < 0) {
                System.out.println("enter positive elem");
                arr[i] = sc.nextInt();
            }




        }
        System.out.println("your element");
        for (int i=0;i<n;i++) {
            System.out.print(  "  " + arr[i]);
        }
        int max = arr[0];
        int min = arr[0];
        int Smax = max;

        System.out.println(" ");

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                Smax=max;  //purana maximum isme save horha h
                max = arr[i]; // naya maximum h

            } else if (arr[i] > Smax && arr[i] != max) {
                Smax = arr[i];


            }

        }
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }


        System.out.println( "maxium" +" " +max);
        System.out.println("secondMaxium"+"   " + Smax);
        System.out.println("minimum"+ "    " +min);
    }


}
















