package Easy._2215_FindTheDifferenceOfTwoArrays;

/*
*   - Cho hai mang so nguyen co chi muc 0 nums1 va nums2, tra ve cau tra loi danh sach co kich thuoc 2
*   trong do:
*   - answer[0] la danh sach tat ca cac so nguyen rieng biet trong nums1 ko co trong nums2
*   - answer[1] la danh sach tat ca cac so nguyen rieng biet trong nums2 ko co trong nums1
*   - Luu y rang cac so nguyen trong danh sach co the dc tra ve theo bat ky thu tu nao
*   VD1: nums1 = [1,2,3], nums2 = [2,4,6] => [[1,3],[4,6]]
*   VD2: nums1 = [1,2,3,3], nums2 = [1,1,2,2] => [[3],[]]
*   - Rang buoc:
*       + 1 <= nums1.length, nums2.length <= 1000
*       + -1000 <= nums1[i], nums2[i] <= 1000
*/

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getCommonValues(nums1, nums2), getCommonValues(nums2, nums1));
    }

    private static List<Integer> getCommonValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }
        for (int num : nums1) {
            if(!set2.contains(num)) set1.add(num);
        }
        return new ArrayList<>(set1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3}, nums2 = {2,4,6};
        System.out.println(findDifference(nums1, nums2));
    }
}
