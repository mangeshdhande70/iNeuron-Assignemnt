package Assignment_2;

import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Size Of Array");
        int size_of_array = scan.nextInt();

        int a[] = new int[size_of_array];

        System.out.println("Enter Elements in Array");
        for (int i = 0; i < size_of_array; i++)
            a[i] = scan.nextInt();


        System.out.println("\nBefore Sorting");
        for (int ele : a)
            System.out.print(ele + " ");


        sort(a);

        System.out.println("\nAfter Sorting");
        for (int ele : a)
            System.out.print(ele + " ");



    }

    static void sort(int arr[])
    {
        for (int i = 0; i < arr.length ; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_index])
                {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }
    }
}
