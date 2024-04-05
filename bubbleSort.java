import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, temp;

        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int a[] = new int [n];

        System.out.println("Enter the array elements ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The original array is ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1; j++) {
                if(a[j + 1] < a[j]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        System.out.println("The sorted array is ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
