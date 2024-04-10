package Easy._205_IsomorphicStrings;

/*
*   - Cho 2 chuoi s va t, hay xac dinh xem chung co dang cau hay khong
*   - Hai chuoi s va t la dang cau neu cac ky tu trong s co the thay the duoc de thu duoc t
*   - Tat ca cac lan xuat hien cua mot ky tu phai duoc thay the bang mot ky tu khac ma van giu nguyen
*   thu tu cac ky tu. Ko co hai ky tu nao co the anh xa toi cung mot ky tu, nhung mot ky tu co the anh
*   xa toi chinh no.
*   VD1: s = "egg", t = "add" => true
*   VD2: s = "foo", t = "bar" => false
*   - Rang buoc:
*       + 1 <= s.length <= 5 * 104
*       + t.length == s.length
*       + s va t bao gom bat ky ky tu ascii hop le nao.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Character> ss = new HashMap<>();
        Map<Character, Character> tt = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            ss.put(sChar, ss.getOrDefault(sChar, tChar));
            tt.put(tChar, tt.getOrDefault(tChar, sChar));
            if(ss.get(sChar) != tChar || tt.get(tChar) != sChar) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.print("s va t la 2 chuoi dang cau: " + isIsomorphic(s, t));
    }
}
