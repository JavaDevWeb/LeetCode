package Easy.Math._66_PlusOne;

/*
*   - Ban dc cho mot so nguyen lon dc bieu dien duoi dang mang so nguyen, trong do moi digits[i] la chu so i
*   cua so nguyen. Cac chu so dc sap xep tu quan trong nhat den khong quan trong theo thu tu tu trai qua
*   phai. So nguyen lon nhat ko chua bat ky chu so 0 nao o dau vao.
*   - Tang so nguyen lon nhat len 1 va tra ve mang chu so ket qua
*   VD1: digits = [1,2,3] => digits = [1,2,4]
*   VD2: digits = [9] => digits = [1, 0]
*   - Rang buoc:
*       + 1 <= digits.length <= 100
*       + 0 <= digits[i] <= 9
*       + Cac chu so ko chua chu so 0 o dau
*/

public class Solution {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if(digits[i] < 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
           }
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        int[] result = plusOne(digits);
        System.out.print("Result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
