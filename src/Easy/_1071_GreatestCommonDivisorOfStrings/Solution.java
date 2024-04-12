package Easy._1071_GreatestCommonDivisorOfStrings;

/*
*   - Doi voi 2 chuoi s va t, chung ta noi "t chia s" khi va chi khi s = t + t + t + ... + t + t
*   (tuc la t dc noi voi chinh no mot hoac nhieu lan)
*   - Cho 2 chuoi str1 va str2, tra ve chuoi x lon nhat sao cho x chia ca str1 va str2
*   VD1: str1 = "ABCABC", str2 = "ABC" => "ABC"
*   VD2: str1 = "ABABAB", str2 = "ABAB" => "AB"
*   - Rang buoc:
*       + 1 <= str1.length, str2.length <= 1000
*       + str1 va str2 bao gom cac chu cai viet hoa Tieng Anh
*/

public class Solution {
    public static String gcdOfStrings(String str1, String str2) {
        String bigger = str1.length() > str2.length() ? str1 : str2;
        String smaller = str1.length() > str2.length() ? str2 : str1;

        if(bigger.equals(smaller)) return smaller;
        if(!bigger.startsWith(smaller)) return "";
        return gcdOfStrings(bigger.substring(smaller.length()), smaller);
    }

    public static void main(String[] args) {
        String str1 = "ABABAB", str2 = "ABAB";
        System.out.print("Chuoi sau khi chia la: " + gcdOfStrings(str1, str2));
    }
}
