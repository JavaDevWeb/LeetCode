package Easy.Array._88_MergeSortedArray;

/*
*   - Ban duoc cung cap hai mang so nguyen nums1 va nums2, duoc sap xep theo thu tu khong giam, cung hai so
*   nguyen m va n, dai dien cho so phan tu trong nums1 va nums2 tuong ung
*   - Hop nhat nums1 va nums2 thanh 1 mang duy nhat duoc sap xep theo thu tu khong giam
*   - Mang duoc sap xep cuoi cung khong duoc tra lai boi ham, ma thay vao do duoc luu tru ben trong mang
*   nums1. De lam dieu nay, nums1 co do dai la m + n, trong do m phan tu dau tien chi ra cac phan tu can
*   duoc hop nhat, va n phan tu cuoi cung duoc dat thanh 0 va se duoc bo qua nums2 co do dai la n.
*   VD1: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 => nums = [1,2,2,3,5,6]
*   VD2: nums1 = [1], m = 1, nums2 = [], n = 0 => nums = [1]
*/

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;

        while (k >= 0) {
            if(j < 0) {
                nums1[k] = nums1[i];
                i--;
            }
            else if(i < 0) {
                nums1[k] = nums2[j];
                j--;
            }
            else if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.println("DONE");
    }
}
