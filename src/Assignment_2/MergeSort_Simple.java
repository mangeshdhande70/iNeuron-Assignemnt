package Assignment_2;

import java.util.Scanner;

public class MergeSort_Simple {

        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Size Of Array");
        int size_of_array = scan.nextInt();

        int a[] = new int[size_of_array];

        System.out.println("Enter Elements in Array");
        for (int i = 0; i < size_of_array; i++)
            a[i] = scan.nextInt();


//            int a[] = {10,2,43,5,6,89,0,100,2362,231,1,3,434,2323};

            System.out.println("Before Sorting");
            for (int ele : a)
                System.out.print(ele + " ");


            mergeSort(a, 0, a.length);

            System.out.println("\nAfter Sorting");
            for (int ele : a)
                System.out.print(ele + " ");

        }

        public static void mergeSort(int [] a,int low,int high){

            if (high - low == 1 || high - low == 0)
                return;

            int mid = low+(high-low)/2;

            int [] array1 = new int[mid];
            int [] array2 = new int[high-mid];


            for (int i = 0; i < mid ; i++)
                array1[i] = a[i];


            for (int i = 0; i < array1.length ; i++) {
                int min_index = i;
                for (int j = i+1; j < array1.length; j++) {
                    if (array1[j] < array1[min_index])
                    {
                        min_index = j;
                    }
                }
                int temp = array1[i];
                array1[i] = array1[min_index];
                array1[min_index] = temp;

            }

            int k =0;
            for (int i = mid; i < high; i++)
                array2[k++] = a[i];


            for (int i = 0; i < array2.length ; i++) {
                int min_index = i;
                for (int j = i+1; j < array2.length; j++) {
                    if (array2[j] < array2[min_index])
                    {
                        min_index = j;
                    }
                }
                int temp = array2[i];
                array2[i] = array2[min_index];
                array2[min_index] = temp;

            }

            int i = 0 , j = 0 , n=0;
            int [] newArray = new int[high-low];
            while (i<mid && j<array2.length)
            {
                if (array1[i] < array2[j])
                    newArray[n++] = array1[i++];
                else
                    newArray[n++] = array2[j++];
            }

            while (i<mid)
                newArray[n++] = array1[i++];

            while (j<mid)
                newArray[n++] = array2[j++];


            for (int l = 0; l < n ; l++)
                a[low++] = newArray[l];

        }

    }


