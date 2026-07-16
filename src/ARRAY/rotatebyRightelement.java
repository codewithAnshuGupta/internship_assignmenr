package ARRAY;

public class rotatebyRightelement {
    public static void reverse(int[] arr, int si, int ei) {

        for (int i = si, j = ei; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("     ");
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7,};
        print(arr);
        int n = arr.length;
        int k = 2;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        print(arr);



    }
}




