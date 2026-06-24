package internship_assignment;

import java.util.Scanner;
public class palindromic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
         int original=n;
         int reverse=0;
         while(n!=0){
             int lastdigit=n%10;
             reverse=reverse*10+lastdigit;
             n=n/10;
         }
         if(original==reverse){
             System.out.println("palindrome number");}
         else{
             System.out.print("not a pallindrom");
         }
    }
}
