package Easy.String._2678_NumberofSeniorCitizens;

/*
*   - Ban dc cung cap mot mang co chi so tu 0 chua cac chuoi thong tin ve cac hanh khach, moi phan tu cua mang
*   cung cap thong tin ve mot hanh khach duoc nen thanh mot chuoi co do dai 15 ky tu. He thong duoc thiet ke nhu sau:
*       + Muoi ky tu dau tien bao gom so dien thoai cua khach hang.
*       + Ky tu tiep theo chi dinh gioi tinh cua nguoi do.
*       + Hai ky tu tiep theo dc su dung de chi ra tuoi cua nguoi do.
*       + Hai ky tu cuoi cung xac dinh ghe duoc phan cho nguoi do.
*   => Tra ve so luong khach hang co tuoi tren 60 tuoi mot cach chinh xac
*   VD1: details = ["7868190130M7522","5303914400F9211","9273338290F4010"] => Co 2 nguoi tren 60 tuoi.
*   VD2: details = ["1313579440F2036","2921522980M5644"] => ko co nguoi nao tren 60 tuoi.
*   - Rang buoc:
*       + 1 <= details.length <= 100
*       + details[i].length == 15
*       + details[i] chua cac so tu '0' den '9'.
*       + details[i][10] co the la 'M' hoac 'F' hoac 'O'.
*       + So dien thoai va so ghe cua khach hang la khac nhau
*/

public class Solution {
    public static int countSeniors(String[] details) {
            int count = 0;
            for (String s : details) {
                int age = Integer.parseInt(s.substring(11, 13));
                if(age > 60) {
                    count++;
                }
            }
            return count;
    }

    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.print("So khach hang tren 60 tuoi la: " + countSeniors(details));
    }
}
