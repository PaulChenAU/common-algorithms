package sort;
import static sort.Utils.swap;
import static sort.Utils.printArr;

public class BubbleSort {

    /**
     * bubble sort swaps the adjacent value each time if the order is wrong
     * each time we can move the largest value to the end
     * @param arr
     */
    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3,2,6,1,7,4,5};
        printArr(arr, arr.length);
        bubbleSort(arr);
        printArr(arr, arr.length);

    }
}
