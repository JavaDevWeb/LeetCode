package Easy._1732_FindTheHighestAltitude;

/*
*   - Co mot nguoi di xe dap dang di tren duong. Chuyen di bao gom n + 1 diem o cac do cao khac nhau.
*   Nguoi di xe dap bat dau hanh trinh cua minh o diem 0 voi do cao bang 0.
*   - Ban dc cap 1 mang so nguyen co do dai n trong do Gain[i] la muc tang rong ve do cao giua cac
*   diem i va i + 1 cho tat ca (0 <= i < n). Tra ve do cao cao nhat cua mot diem.
*   VD1: gain = [-5,1,5,0,-7] => 1
*   VD2: gain = [-4,-3,-2,-1,4,3,2] => 0
*   - Rang buoc:
*       + n == gain.length
*       + 1 <= n <= 100
*       + -100 <= gain[i] <= 100
*/

public class Solution {
    public static int largestAltitude(int[] gain) {
        int res = 0;
        int alt = 0;

        for (int climb : gain) {
            alt += climb;
            res = Math.max(res, alt);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println("largestAltitude: " + largestAltitude(gain));
    }
}
