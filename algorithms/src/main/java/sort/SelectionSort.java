package sort;
import static sort.Utils.swap;
import static sort.Utils.printArr;

public class SelectionSort {

    /**
     * selection sort selects the minimum value every loop
     * and swap the minimum value with index from 0 to len
     * e.g
     * 6, 2, 3, 5 -> 2, 6, 3, 5 -> 2, 3, 6, 5...
     *
     * @param arr
     */
    public static void selectionSort(int arr[]){
        int min, index;

        for (int i = 0; i < arr.length; i++) {
            min = Integer.MAX_VALUE;
            index = -1;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            swap(arr, i, index);
        }

    }


    public static void main(String[] args) {
        int[] arr = new int[]{3,2,6,1,7,4,5};
        printArr(arr, arr.length);
        selectionSort(arr);
        printArr(arr, arr.length);

    }
}
