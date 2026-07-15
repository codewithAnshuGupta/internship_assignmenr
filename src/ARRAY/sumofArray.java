package ARRAY;
import java.util.Scanner;

public class sumofArray {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array");
    int n=sc.nextInt();
    if(n<=0){
        System.out.println("invalid ");
        return;
    }

    int []srr =new int[n];
    System.out.println("enter array element");
    for(int i=0;i<n;i++){
srr[i] =sc.nextInt();


    if(srr[i]<0){
        System.out.println("not valid");
        return;
    }}

    int sum=0;
    for(int i=0;i<n;i++){
        sum=sum+srr[i];
    }
    System.out.println("sum =" +sum);


}







}
