package search;

public class BinarySearch {

    /**
     * iterative binary search
     *
     * @param arr   array must be sorted in ascending order
     * @param l     left index of array, typically 0
     * @param r     right index of array, typically arr.length-1
     * @param x     the int number we wanna search
     * @return
     */
    public static int binarySearch(int arr[], int l, int r, int x){
        if(arr.length == 0){ return -1;}

        while (l <= r){
            int mid = l + (r-l)/2;

            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] > x){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }

        return -1;
    }

    /**
     *
     * @param arr
     * @param l
     * @param r
     * @param x
     * @return
     */
    public static int binarySearchRecursion(int arr[], int l, int r, int x){

        if(l <= r){
            int mid = l + (r-l)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] > x){
                return binarySearchRecursion(arr, l, mid-1, x);
            }
            else{
                return binarySearchRecursion(arr, mid+1, r, x);
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        System.out.println(binarySearch(arr, 0, 6, 1));
        System.out.println(binarySearch(arr, 0, 6, 2));
        System.out.println(binarySearch(arr, 0, 6, 6));
        System.out.println(binarySearch(arr, 0, 6, 9));
        System.out.println(binarySearchRecursion(arr, 0, 6, 1));
        System.out.println(binarySearchRecursion(arr, 0, 6, 2));
        System.out.println(binarySearchRecursion(arr, 0, 6, 6));
        System.out.println(binarySearchRecursion(arr, 0, 6, 9));
    }
}
