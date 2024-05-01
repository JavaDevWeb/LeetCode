package Easy._1207_UniqueNumberOfOccurrences;

/*
*   - Cho mot mang cac so nguyen arr, tra ve true neu so lan xuat hien cua moi gia tri trong mang la duy nhat
*   hoac sai neu nguoc lai.
*   VD1: arr = [1,2,2,1,1,3] => true
*   VD2: arr = [1,2] => false
*   - Rang buoc:
*       + 1 <= arr.length <= 1000
*       + -1000 <= arr[i] <= 1000
*/

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> num_occurrences = new HashMap<>();
        for(int num : arr) {
            num_occurrences.put(num, num_occurrences.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> unique_vals = new HashSet<>(num_occurrences.values());
        return num_occurrences.size() == unique_vals.size();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}
