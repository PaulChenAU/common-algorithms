package sort;

public class Utils {

    /**
     * swap i-th element and j-th element in arr
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     *
     * @param arr
     * @param len
     */
    public static void printArr(int arr[], int len){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < len-1; i++) {
            sb.append(arr[i]);
            sb.append(", ");
        }
        sb.append(arr[len-1]);
        sb.append(']');
        System.out.println(sb.toString());
    }

}
