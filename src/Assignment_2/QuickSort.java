package Assignment_2;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Size Of Array");
        int size_of_array = scan.nextInt();

        int arr[] = new int[size_of_array];

        System.out.println("Enter Elements in Array");
        for (int i = 0; i < size_of_array; i++)
            arr[i] = scan.nextInt();


//        int[] arr = {10, 2, 43, 5, 6, 89, 0, 100, 2362, 231, 1, 3, 4444, 434, 2323, 4454, 324, 3432, 3543, 8933, 32234, 6543, 3243};

        System.out.println("\nBefore Sorting : ");
        for (int i : arr)
            System.out.print(i + " ");

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Sorting : ");
        for (int i : arr)
            System.out.print(i + " ");

    }

    public static void quickSort(int[] a, int left, int right) {

        if (left < right) {

            int piv = partition(a, left, right);

            quickSort(a, left, piv - 1);
            quickSort(a, piv + 1, right);
        }
    }

    public static int partition(int[] a, int low, int high) {

        int piv = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (a[j] < piv) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        int temp = a[i];
        a[i] = piv;
        a[high] = temp;
        return i;

    }
}
