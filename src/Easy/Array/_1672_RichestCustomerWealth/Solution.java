package Easy.Array._1672_RichestCustomerWealth;

/*
*   - Ban dc cho mot luoi so nguyen m x n co ten la accounts, trong do accounts[i][j] la so tien ma
*   khach hang thu i co trong ngan hang thu j. Tra ve so tien giau nhat ma khach hang giau nhat co.
*   - Tai san cua mot khach hang la so tien ho co trong tat ca cac tai khoan ngan hang cua ho. Khach
*   hang giau nhat la khach hang co tai san lon nhat.
*   VD1: accounts = [[1,2,3],[3,2,1]] => 1st = 6, 2st = 6 => ca 2 khach hang deu giau nhat
*   VD2: accounts = [[1,5],[7,3],[3,5]] => 1st = 6, 2st = 10, 3st = 8 => 2st giau nhat
*   - Rang buoc:
*       + 1 <= nums.length <= 500
*       + 1 <= nums[i] <= 10^5
*/

public class Solution {
    public static int maximumWealth(int[][] accounts) {
        int soKhachHang = accounts.length;
        int soNganHang = accounts[0].length;
        int[] tongTaiSan = new int[soKhachHang];

        for (int i = 0; i < soKhachHang; i++) {
            int tinhTongHangI = 0;
            for (int j = 0; j < soNganHang; j++) {
                tinhTongHangI += accounts[i][j];
            }
            tongTaiSan[i] = tinhTongHangI;
        }

        int max = 0;
        for (int i = 0; i < soKhachHang; i++) {
            System.out.println("Tong tai san khach hang " + (i + 1) + " la: " + tongTaiSan[i]);
            if(tongTaiSan[i] > max) {
                max = tongTaiSan[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        int soHang = accounts.length;
        int soCot = accounts[0].length;
        System.out.println("So hang: " + soHang);
        System.out.println("So cot: " + soCot);

        for (int i = 0; i < soHang; i++) {
            System.out.print("So tien trong ngan hang cua khach hang " + (i + 1) + " la: ");
            for (int j = 0; j < soCot; j++) {
                System.out.print(accounts[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Khach hang co so tien lon nhat la: " + maximumWealth(accounts));
    }
}
