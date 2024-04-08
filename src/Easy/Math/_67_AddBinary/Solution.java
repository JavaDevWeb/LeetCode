package Easy.Math._67_AddBinary;

/*
*   - Cho hai chuoi nhi phan a va b, tra ve tong cua chung duoi dang chuoi nhi phan
*   VD1: a = "11", b = "1" => "100"
*   VD2: a = "1010", b = "1011" => "10101"
*   - Rang buoc:
*       + 1 <= a.length, b.length <= 104
*       + a va b chi bao gom cac ky tu '0' va '1'
*       + Moi chuoi ko chua cac so 0 dung dau ngoai tru chinh so 0 do
*/

public class Solution {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if(i >= 0) sum += a.charAt(i) - '0';
            if(j >= 0) sum += b.charAt(j) - '0';
            sb.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.print("Day nhi phan cua tong a va b la: " + addBinary(a, b));
    }
}
