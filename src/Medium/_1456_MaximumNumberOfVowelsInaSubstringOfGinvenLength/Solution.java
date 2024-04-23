package Medium._1456_MaximumNumberOfVowelsInaSubstringOfGinvenLength;

/*
*   - Cho mot chuoi s va 1 so nguyen k, tra ve so luong toi da cac chu cai nguyen am trong bat ky chuoi
*   con nao cua s co do dai k.
*   - Cac chu cai nguyen am trong tieng anh la 'a', 'e', 'i', 'o' va 'u'
*   VD1: s = "abciiidef", k = 3 => 3
*   VD2: s = "aeiou", k = 2 => 2
*   - Rang buoc:
*       + 1 <= s.length <= 105
*       + s thuoc cai chu cai tieng anh viet thuong
*       + 1 <= k <= s.length
*/

public class Solution {
    public static int maxVowels(String s, int k) {
            int l = 0, r = 0, res = 0, window = 0;
            for(r = 0; r < k; r++) {
                window += isVowel(s.charAt(r));
            }
            res = window;
            while(r < s.length()) {
                window -= isVowel(s.charAt(l));
                l++;
                window += isVowel(s.charAt(r));
                r++;
                res = Math.max(res, window);
            }
            return res;
    }

    private static int isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println("maxVowels: " + maxVowels(s, k));
    }
}
