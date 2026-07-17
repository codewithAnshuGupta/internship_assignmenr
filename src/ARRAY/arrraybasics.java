package ARRAY;
import java.util.Scanner;
public class arrraybasics {

    public static void main() {
         Scanner sc =new Scanner(System.in);
        System.out.println("enter size of element");
        int n=sc.nextInt();
        while(n<=0) {
            System.out.println("enter element size again");
            n = sc.nextInt();

        }
        int[] arr=new int[n];
        System.out.println("enter array element"); //input of array
        for(int i=0;i<n;i++)
        { arr[i]=sc.nextInt();}

        for(int i =0;i<n;i++){
            System.out.print("    " + arr[i]); //printing
        }



    }


}
