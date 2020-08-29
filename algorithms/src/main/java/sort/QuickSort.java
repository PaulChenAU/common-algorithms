package sort;

import static sort.Utils.printArr;
import static sort.Utils.swap;

public class QuickSort {


    public static void quickSort(int arr[], int begin, int end){
        if(begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    public static int partition(int arr[], int begin, int end){
        int pivot = arr[end];
        int i = begin;

        for (int j = begin; j <= end; j++) {
            if(arr[j] < pivot){
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, end);

        return i;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,6,1,7,4,5};
        printArr(arr, arr.length);
        quickSort(arr, 0, arr.length-1);
        printArr(arr, arr.length);
    }
}
