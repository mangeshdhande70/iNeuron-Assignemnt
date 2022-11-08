package Assignment_2;

import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Size Of Array");
        int size_of_array = scan.nextInt();

        int a[] = new int[size_of_array];

        System.out.println("Enter Elements in Array");
        for (int i = 0; i < size_of_array; i++)
            a[i] = scan.nextInt();


//        int a[] = {10,2,43,5,6,89,0,100,2362,231,1,3,434,2323};

        System.out.println("\nBefore Sorting");
        for (int ele : a) {
            System.out.print(ele + " ");
        }

        mergeSort(a, 0, a.length);

        System.out.println("\nAfter Sorting");
        for (int ele : a) {
            System.out.print(ele + " ");
        }
    }

        public static void mergeSort(int [] a,int low,int high){

             if (high - low == 1 )
                 return;

             int mid = low+(high-low)/2;


             mergeSort(a,0,mid);
             mergeSort(a,mid,high);

//             System.out.println(low+" "+mid+" "+high);

             mergeInPlace(a,0,mid,high);


        }

        public static void mergeInPlace(int []a,int low ,int mid,int high)
        {
            int [] newArray = new int[high-low];
            int k=0;
            int i = 0 , j = mid;

            while (i<mid && j<high)
            {
                if (a[i] < a[j])
                    newArray[k++] = a[i++];
                else
                    newArray[k++] = a[j++];

            }

            while (i<mid)
            {
                newArray[k++] = a[i++];
            }
            while (j<mid)
            {
                newArray[k++] = a[j++];
            }

            for (int l = 0; l < k ; l++) {
                 a[low++] = newArray[l];
            }


        }

}
