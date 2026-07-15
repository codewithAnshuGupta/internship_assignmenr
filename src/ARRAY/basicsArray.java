
//finding maxium in array
package ARRAY;
import java.util.Scanner;
public class basicsArray {
    public static void main ( String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();



        int[] arr=new int[n];
        System.out.println("enter array element"); //input
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " " );
          }

        //maxium
    int max=0;
        for(int i =0;i<n;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

            System.out.println(max);





    }


}


