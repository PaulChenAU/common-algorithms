package sort;

import static sort.Utils.printArr;
import static sort.Utils.swap;

public class QuickSort {

    /**
     * quick sort select a pivot every time and then
     * find a location that the elements before the
     * location are smaller than this pivot, and the
     * elements after it are bigger than it.
     *
     * @param arr
     * @param begin
     * @param end
     */
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
