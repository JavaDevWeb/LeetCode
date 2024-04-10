package Easy._13_RomanToInteger;

/*
*   - Chu so La Ma dc bieu dien bang 7 ky hieu khac nhau: I = 1, V = 5, X = 10, L = 50, C = 100, D = 500 va M = 1000
*   - Vi du, so 2 dc viet la II trong so La Ma, chi la hai so 1 + voi nhau. So 12 dc viet la XII, do chi la X + II.
*   So 27 dc viet la XXVII, do la XX + V + II.
*   - Chu so La Ma thuong dc viet lon nhat den nho nhat tu trai sang phai. Tuy nhien, ky hieu cho so bon ko phai la
*   IIII. Thay vao do so bon dc viet la IV. Vi mot dung trc nam chung ta tru no di lam bon. Nguyen tac tuong tu duoc
*   ap dung cho so chin, dc viet la IX. Co sau truong hop khi phai tru:
*       + I co the dc dat trc V(5) va X(10) de tao thanh 4 va 9
*       + X co the dc dat trc L(50) va C(100) de tao thanh 40 va 90
*       + C co the dc dat trc D(500) va M(1000) de tao thanh 400 va 900
*   - Cho 1 so La Ma va chuyen no thanh so nguyen
*   VD1: s = "III" => s = 3
*   VD2: s = "LVIII" => s = 58
*   - Rang buoc:
*       + 1 <= s.length <= 15
*       + s chi chua cac ky tu ('I', 'V', 'X', 'L', 'C', 'D', 'M')
*       + Dam bao rang s la mot so La Ma hop le trong khoang [1, 3999]
*/

import java.util.Scanner;

public class Solution {
    public static int romanToInt(String s) {
        int prev = 0; // So ben phai dang xet
        int num = 0; // So dang xet
        int ans = 0; // Dap an cuoi cung
        char[] arr = s.toCharArray();

        for(int i = arr.length - 1; i >= 0; i--) {
            switch (arr[i]) {
                case 'I':
                    num = 1; break;
                case 'V':
                    num = 5; break;
                case 'X':
                    num = 10; break;
                case 'L':
                    num = 50; break;
                case 'C':
                    num = 100; break;
                case 'D':
                    num = 500; break;
                case 'M':
                    num = 1000; break;
            }

            if(num < prev) {
                ans -= num;
            } else {
                ans += num;
            }
            prev = num;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so La Ma can chuyen: ");
        String s = sc.nextLine();
        System.out.print("So La Ma sau khi chuyen sang so nguyen la: " + romanToInt(s));
    }
}
