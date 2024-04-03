package Easy.Array._35_SearchInsertPosition;

/*
*   - Cho mot mang dc sap xep gom cac so nguyen rieng biet va gia tri dich, tra ve vi tri neu tim
*   thay muc tieu. Neu ko, hay tra ve vi tri o vi tri cu neu no duoc chen theo thu tu
*   - Ban phai viet 1 thuat toan co do phuc tap thoi gian chay O(log n)
*   VD1: nums = [1,3,5,6], target = 5 => 2
*   VD2: nums = [1,3,5,6], target = 2 => 1
*   - Rang buoc:
*       + 1 <= nums.length <= 104
*       + -104 <= nums[i] <= 104
*       + nums chua cac gia tri rieng biet duoc sap xep theo thu tu tang dan
*       + -104 <= target <= 104
*/

public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) left = mid + 1;
            if(nums[mid]>target) right = mid - 1;
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println("Vi tri tim thay muc tieu la: " + searchInsert(nums, target));
    }
}
