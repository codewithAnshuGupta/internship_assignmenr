package ARRAY;
import java .util.Scanner;
public class stock {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of product"); // size
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("invalid");
            return;}


        int[] arr = new int[n];
        System.out.println("enter stock quantity"); // stock 1=300
for(int i=0;i<n;i++)
{
    System.out.print("product"+(i+1)+"---");
    arr[i] = sc.nextInt();

}
int sum=0;
int max=arr[0];
int min=arr[0];
for(int i=0;i<n;i++) {

    if (arr[i] > max) {
        max = arr[i];
    }

    if (arr[i] < min) {
        min = arr[i];
    }



    sum=sum+arr[i];

}

        System.out.println(" total stock " + sum);
        System.out.println(" highest stock " + max);
        System.out.println(" lowest stock " +min);





}



    }
