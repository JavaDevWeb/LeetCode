package Medium._1657_DetermineIfTwoStringAreClose;

/*
*   - Hai chuoi dc coi la gan nhau neu ban co the dat dc mot chuoi tu chuoi kia bang cac thao tac sau:
*   - Thao tac 1: Hoan doi hai ky tu hien co bat ky: VD: abcde -> aecdb
*   - Thao tac 2: Chuyen doi moi lan xuat hien cua mot ky tu co thanh mot ky tu hien co khac va thuc hien
*   tuong tu voi ky tu con lai: VD: aacabb -> bbcbaa (tat ca a bien thanh b va tat ca b bien thanh a)
*   - Ban co the su dung cac thao tac tren mot trong hai chuoi nhieu lan neu can
*   - Cho hai chuoi, word1 va word2, tra ve true neu word1 va word2 gan nhau va tra ve false neu nguoc lai
*   VD1: word1 = "abc", word2 = "bca" => true
*   VD2: word1 = "a", word2 = "aa" => false
*   - Rang buoc:
*       + 1 <= word1.length, word2.length <= 105
*       + word1 va word2 chi chua cac chu cai tieng anh viet thuong
*/

import java.util.Arrays;

public class Solution {
    public static boolean closeStrings(String word1, String word2) {
        if(word1.length() !=  word2.length()) return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(char ch : word1.toCharArray()) {
            freq1[ch - 'a']++;
        }
        for(char ch : word2.toCharArray()) {
            freq2[ch - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if((freq1[i] == 0 && freq2[i] != 0) || (freq2[i] == 0 && freq1[i] != 0)){
                return false;
            }
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        return Arrays.equals(freq1, freq2);
    }

    public static void main(String[] args) {
        String word1 = "abc", word2 = "bca";
        System.out.println(closeStrings(word1, word2));
    }
}
