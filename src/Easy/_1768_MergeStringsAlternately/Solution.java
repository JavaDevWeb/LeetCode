package Easy._1768_MergeStringsAlternately;

/*
*   - Ban dc cap 2 chuoi word1 va word2. Hop nhat cac chuoi bang cach them cac chu cai theo thu tu
*   xen ke, bat dau bang word1. Neu mot chuoi dai hon chuoi kia, hay them cac chu cai bo sung vao
*   cuoi chuoi da hop nhat
*   - Tra ve chuoi da hop nhat
*   VD1: word1 = "abc", word2 = "pqr" => "apbqcr"
*   VD2: word1 = "ab", word2 = "pqrs" => "apbqrs"
*   - Rang buoc:
*       + 1 <= word1.length, word2.length <= 100
*       + word1 va word2 bao gom cac chu cai TA viet thuong
*/

public class Solution {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();
        int i = 0;
        while (i < n1 || i < n2) {
            if(i < n1) {
                sb.append(word1.charAt(i));
            }
            if(i < n2) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        System.out.print("Chuoi da hop nhat la: " + mergeAlternately(word1, word2));
    }
}
