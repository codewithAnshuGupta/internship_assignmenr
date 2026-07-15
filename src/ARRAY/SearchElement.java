package ARRAY;
import java.util.*;
public class SearchElement {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 5, 8, 9, 8, 4, 6};
        System.out.println("enter element for search");
        int x = sc.nextInt();

        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("it is present");

            }
        }
    }
}


