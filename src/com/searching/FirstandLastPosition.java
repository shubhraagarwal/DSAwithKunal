package src.com.searching;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstandLastPosition {
   
    public static void main(String[] args) {
        
    }
        public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);    
        ans[1] = search(nums, target, false);
        
        return ans;
    }
    
    int search(int[] arr, int target, boolean findStartIndex){
        int start = 0;
        int ans = -1;
        int end = arr.length -1;
        
        while(start <=end){
            int mid = start + (end - start );
            if(target < arr[mid]){
                end = mid -1;
                
            } else if (target > arr[mid]){
                start = mid + 1;
            } else{
                //we have our potential answer here so now we need to check if there is any other occurence of target on it's left or right
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
