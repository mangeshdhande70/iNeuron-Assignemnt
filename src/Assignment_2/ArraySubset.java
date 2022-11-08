package Assignment_2;

public class ArraySubset {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,7,3};

        boolean flag = true;
        int i=0,j=0;
        int l1= arr1.length;
        int l2 = arr2.length;

        for (i = 0; i < l2; i++) {
            for (j = 0; j < l1; j++) {
                if (arr1[j] == arr2[i])
                    break;
            }
            if (j==l1) {
                System.out.println(j);
                flag = false;
            }

        }

        if (flag)
                System.out.println("Subset");
        else
                System.out.println("Not Subset");



    }
}
