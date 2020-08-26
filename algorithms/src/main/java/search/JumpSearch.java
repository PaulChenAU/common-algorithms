package search;

public class JumpSearch {


    /**
     * assume we have index 0, 1, 2, 3, 4, 5, 6, 7, 8, 9...
     * we search every m elements
     * e.g search 0, 4, 8...
     *
     * @param arr   array must be sorted in ascending order
     * @param m     jump number: we search every m elements
     * @param x     the int number we wanna search
     * @return
     */
    public static int jumpSearch(int arr[], int m, int x){
        if(arr.length == 0){ return -1;}
        int index = 0;
        while (index < arr.length){
            if(arr[index] == x){
                return index;
            }
            else if(arr[index] < x){
                index += m;
            }
            else {
                break;
            }
        }

        // search number x may in the interval of index-m and index
        int lastIndex = index - m;
        if(index > arr.length-1){
            index = arr.length-1;
        }
        for (int i = lastIndex; i < index; i++) {
            if(arr[i] == x){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        System.out.println(jumpSearch(arr, 3, 1));
        System.out.println(jumpSearch(arr, 3, 2));
        System.out.println(jumpSearch(arr, 3, 4));
        System.out.println(jumpSearch(arr, 3, 6));
        System.out.println(jumpSearch(arr, 3, 7));
        System.out.println(jumpSearch(arr, 3, 8));

    }
}
