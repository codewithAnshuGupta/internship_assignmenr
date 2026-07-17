package ARRAY;
import java.util.Scanner;
public class sumofarray2 {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of element");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("enter your size again");
            n = sc.nextInt();
        }

        int[] arr = new int[n];
        System.out.println("enter arrray element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            while ( arr[i]<0){
                System.out.println("enter positive value of array");
                arr[i] = sc.nextInt();

            }
        }

        for(int i=0;i<n;i++){
            System.out.print("  " + arr[i]);

        }
        System.out.println(" ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

        }
        System.out.println("your sum"+" "+sum);

    }
    }






