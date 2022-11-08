package Assignment_2;

import java.util.Scanner;

public class Find_the_duplicates_in_arrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int size_of_array = scan.nextInt();

        int a[] = new int[size_of_array];
        System.out.println("Enter Elements in Array");

        for (int i = 0; i < size_of_array; i++)
            a[i] = scan.nextInt();


        for (int ele : a)
            System.out.print(ele+" ");

        findDuplicates(a);

    }

     static void findDuplicates(int arr[])
    {
        System.out.println("\nDuplicates Elements");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }


    }
}
