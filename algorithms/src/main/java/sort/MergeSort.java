package sort;

import static sort.Utils.printArr;

public class MergeSort {

    /**
     * A good diagram illustrate merge sort
     * https://en.wikipedia.org/wiki/File:Merge_sort_algorithm_diagram.svg
     * @param arr
     */
    public static void mergeSort(int arr[]){
        if(arr.length == 1){
            return;
        }

        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length-mid);
        mergeSort(left);
        mergeSort(right);

        merge(left, right, arr);

    }

    public static void merge(int left[], int right[], int arr[]){
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }

        // copy remaining
        while (i < left.length){
            arr[k++] = left[i++];
        }

        while (j < right.length){
            arr[k++] = right[j++];
        }
    }




    public static void main(String[] args) {
        int[] arr = new int[]{3,2,6,1,7,4,5};
        printArr(arr, arr.length);
        mergeSort(arr);
        printArr(arr, arr.length);
    }
}
