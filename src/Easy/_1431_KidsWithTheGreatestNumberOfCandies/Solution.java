package Easy._1431_KidsWithTheGreatestNumberOfCandies;

/*
*   - Co n dua tre dc nhan keo. Ban dc cap 1 mang keo so nguyen, trong do moi candies[i] dai
*   dien cho so luong keo ma dua tre thu i co va mot so nguyen keo bo sung, bieu thi so luong keo
*   bo sung ma ban co
*   - Tra ve ket qua mang boolean cua do dai n, trong do result[i] la dung neu khi dua cho dua tre
*   thu i tat ca keo bo sung, chung se co so luong keo lon nhat trong so tat ca nhung dua tre, hoac
*   sai neu ko
*   - Luu y rang nhieu tre em co the co so luong keo nhieu nhat
*   VD1: candies = [2,3,5,1,3], extraCandies = 3 => [true,true,true,false,true]
*   VD2: candies = [4,2,1,1,2], extraCandies = 1 => [true,false,false,false,false]
*   - Rang buoc:
*       + n == candies.length
*       + 2 <= n <= 100
*       + 1 <= candies[i] <= 100
*       + 1 <= extraCandies <= 50
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = 0;
        for (int i : candies) {
            max = Math.max(max, i);
        }
        for (int i : candies) {
            res.add(i+extraCandies >= max);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.print("Mang ket qua so luong keo la: " + kidsWithCandies(candies, extraCandies));
    }
}
