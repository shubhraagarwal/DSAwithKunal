package src.com.searching;

public class FloorProblem {
    public static void main(String args[]) {
        int[] arr = {1, 2, 7 ,10,12 ,14};
        int target = 7;
        int ceiling = findFloor(arr,  target);
        System.out.println(arr[ceiling]);

    }

    static int findFloor(int[] arr, int target) {
        //Doing binary search 
        int start = arr[0];
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }

        }
        //when the loop breaks, it means that start is now greater than end, this will only happen when the element we're looking for is not found in the array and now we need to return the nearest smallest element which will be arr[end]
        return end;


    }
}
