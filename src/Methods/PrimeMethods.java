package Methods;
import java.util.Scanner;
public class PrimeMethods{
public static void prime() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number");
    int n = sc.nextInt();
    int count = 0;
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            count++;
        }
    }

    if (count == 2) {
        System.out.println("prime");
    } else {
        System.out.println("it is not prime");
    }
}
public static void main(String[] args){
prime();}

}