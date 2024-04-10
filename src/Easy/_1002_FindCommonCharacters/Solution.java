package Easy._1002_FindCommonCharacters;

/*
*   - Cho mot mang chuoi cac tu trong mang, tra ve mot mang gom tat ca cac ky tu hien thi trong tat ca
*   cac chuoi trong cac tu do (bao gom cac ky tu trung lap). Ban co the tra loi cau tra loi theo bat ky
*   thu tu nao
*   VD1: words = ["bella","label","roller"] => ["e","l","l"]
*   VD2: words = ["cool","lock","cook"] => ["c","o"]
*   - Rang buoc:
*       + 1 <= words.length <= 100
*       + 1 <= words[i].length <= 100
*       + words[i] bao gom cac chu cai Tieng Anh viet thuong
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<String> commonChars(String[] words) {
        List<String> common_chars = new ArrayList<>();
        int[] min_frequencies = new int[26];
        Arrays.fill(min_frequencies, Integer.MAX_VALUE);
        for(String current_string : words) {
            int[] char_frequencies = new int[26];
            for (char c : current_string.toCharArray()) {
                char_frequencies[c-'a']++;
            }
            for (int i = 0; i < 26; i++) {
                min_frequencies[i] = Math.min(min_frequencies[i], char_frequencies[i]);
            }
        }
        for (int i = 0; i < 26; i++) {
            while(min_frequencies[i] > 0) {
                common_chars.add("" + (char)(i + 'a'));
                min_frequencies[i]--;
            }
        }
        return common_chars;
    }
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        System.out.print("Nhung tu lap lai trong mang la: " + commonChars(words));
    }
}
