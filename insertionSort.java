import java.util.*;
public class insertionSort {
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

        for (i = 1; i < n - 1; i++) {
            temp = a[i];
            j = i - 1;
            for (; j >= 0; j--) {
                if(a[j] > temp) {
                    //shitfing
                    a[j + 1] = a[j];
                }

                else 
                break;
            }
            a[j + 1] = temp;
        }
        
        System.out.println("The sorted array is ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
