package search;

public class ExponentialSearch {

    /**
     * Exponential: 1, 2, 4, 8, 16...
     * The idea is to search index 1, 2, 4... in a sorted array
     * until we found a number is greater than x or we reach the
     * end of array
     *
     * @param arr   array must be sorted in ascending order
     * @param x     the int number we wanna search
     * @param exp   the exp factor (2 means index * 2 each step)
     * @return
     */
    public static int exponentialSearch(int arr[], int x, int exp){
        int index = 1;
        while(index < arr.length){
            if(arr[index] == x){
                return index;
            }
            else if(arr[index] > x){
                break;
            }
            else{
                index = index * exp;
            }
        }

        if(index > arr.length-1){
            index = arr.length-1;
        }
        int lastIndex = index/exp;

        for (int i = lastIndex; i <= index; i++) {
            if(arr[i] == x){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        System.out.println(exponentialSearch(arr, 1, 2));
        System.out.println(exponentialSearch(arr, 2, 2));
        System.out.println(exponentialSearch(arr, 4, 2));
        System.out.println(exponentialSearch(arr, 6, 2));
        System.out.println(exponentialSearch(arr, 7, 2));
        System.out.println(exponentialSearch(arr, 8, 3));

    }
}
