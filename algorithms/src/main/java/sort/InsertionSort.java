package sort;

import static sort.Utils.swap;
import static sort.Utils.printArr;

public class InsertionSort {

    /**
     * 1. iterate over array 1, 2, 3, ...
     * 2. key equals to arr[1, 2, 3...]
     * 3. arr[j+1] = arr[j] find the insert location and insert
     * @param arr
     */
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];

            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,6,1,7,4,5};
        printArr(arr, arr.length);
        insertionSort(arr);
        printArr(arr, arr.length);
    }
}
