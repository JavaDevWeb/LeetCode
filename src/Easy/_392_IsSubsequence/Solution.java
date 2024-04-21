package Easy._392_IsSubsequence;

/*
*   - Cho 2 chuoi s va t, tra ve true neu s la day con cua t, hoac tra ve false neu nguoc lai
*   - Day con cua 1 chuoi la 1 chuoi moi dc hinh thanh tu chuoi goc bang cach xoa 1 so (co the
*   ko co) ky tu nao ma ko lam anh huong dan vi tri tuong doi cua cac ky tu con lai. (tuc la
*   "ace" la 1 day con cua "abcde" trong khi "aec" thi ko).
*   VD1: s = "abc", t = "ahbgdc" => true
*   VD2: s = "axc", t = "ahbgdc" => false
*   - Rang buoc:
*       + 0 <= s.length <= 100
*       + 0 <= t.length <= 104
*       + s va t chi chua cac chu cai Tieng Anh viet thuong
*/

public class Solution {
    public static boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int s_pointer = 0, t_pointer = 0;
        while(t_pointer < t.length()){
            if(t.charAt(t_pointer) == s.charAt(s_pointer)){
                s_pointer++;
                if(s_pointer == s.length()) return true;
            }
            t_pointer++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println("Chuoi s chuoi con cua t la: " + isSubsequence(s, t));
    }
}
