package sort;

import static sort.Utils.printArr;
import static sort.Utils.swap;

public class HeapSort {

    public static void heapSort(int arr[]){
        // build heap first
        // make sure sub-heap has the maxHeap property
        for (int i = arr.length-1; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }

        // exchange the top with the last node and remove last node from heapify
        for (int i = arr.length-1; i >= 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }

    }

    public static void heapify(int arr[], int len, int index){
        int left, right, max = index;

        while (index < len){
            left = index * 2 + 1;
            right = index * 2 + 2;
            if(left < len && arr[left] > arr[max]){
                max = left;
            }

            if(right < len && arr[right] > arr[max]){
                max = right;
            }

            if(max == index){
                break;
            }

            swap(arr, index, max);
            index = max;
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,3,5,10,1};
        printArr(arr, arr.length);
        heapSort(arr);
        printArr(arr, arr.length);
    }
}
