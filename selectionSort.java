import java.util.*;
public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, temp, pos;

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
            pos = i;
            for (j = i + 1; j < n; j++) {
                if(a[pos] > a[j]) {
                    pos = j;
                }
            }
            temp = a[pos];
            a[pos] = a[i];
            a[i] = temp;
        }
        
        System.out.println("The sorted array is ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
