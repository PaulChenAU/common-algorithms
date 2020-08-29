package sort;

import java.util.Arrays;

import static sort.Utils.printArr;

public class CountingSort {

    /**
     * 1. count the occurrence of distinct numbers(keys)
     * 2. build the nums array nums[key] = occ(key)
     * 3. nums[i] += nums[i-1]
     * 4. find the location e.g nums[1] = 2  =>  arr[2-1] = 1  nums[1]--
     *
     * @param arr
     */
    public static void countingSort(int arr[]){
        int[] nums = new int[10];
        int[] res = new int[arr.length];

        Arrays.fill(nums, 0);

        for (int i = 0; i < arr.length; i++) {
            nums[arr[i]] += 1;
        }

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }

        int index;
        for (int i = 0; i < arr.length; i++) {
            index = nums[arr[i]];
            res[index-1] = arr[i];
            nums[arr[i]] -= 1;
        }

        System.arraycopy(res, 0, arr, 0, res.length);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,4,1,2,7,5,2};
        printArr(arr, arr.length);
        countingSort(arr);
        printArr(arr, arr.length);

    }
}
