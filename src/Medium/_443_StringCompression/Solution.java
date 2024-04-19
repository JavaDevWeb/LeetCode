package Medium._443_StringCompression;

/*
*   - Cho mot mang ky tu, hay nen no bang thuat toan sau:
*   - Bat dau bang mot chuoi trong s. Doi voi moi nhom ky tu lap lai lien tiep trong ky tu:
*       + Neu do dai cua nhom la 1, hay them ky tu vao s
*       + Neu ko, hay them ky tu theo sau la do dai cua nhom
*   - Chuoi nen s ko nen dc tra ve rieng biet ma thay vao do, dc luu tru trong cac ky tu mang ky tu dau vao.
*   Luu y rang do dai nhom tu 10 tro len se dc chia thanh nhieu ky tu trong ky tu
*   - Sau khi sua doi xong mang dau vao, hay tra ve do dai moi cua mang
*   - Ban phai viet mot thuat toan chi su dung khong gian thua khong doi
*   VD1: chars = ["a","a","b","b","c","c","c"] => "a2b2c3".
*   VD2: chars = ["a"] => "a"
*/

public class Solution {
    public static int compress(char[] chars) {
        int i = 0, res = 0;
        while (i < chars.length) {
            int groupLength = 1;
            while (i + groupLength < chars.length && chars[i + groupLength] == chars[i]) {
                groupLength++;
            }
            chars[res++] = chars[i];
            if (groupLength > 1) {
                for (char c : Integer.toString(groupLength).toCharArray()) {
                    chars[res++] = c;
                }
            }
            i += groupLength;
        }
        return res;
    }

    public static void main(String[] args) {
        String[] charsStr = {"a","a","b","b","c","c","c"};
        char[] chars = new char[charsStr.length];
        for (int i = 0; i < charsStr.length; i++) {
            chars[i] = charsStr[i].charAt(0);
        }
        int compressedLength = compress(chars);
        System.out.println("Compressed length: " + compressedLength);
        System.out.print("Compressed array: ");
        for (int i = 0; i < compressedLength; i++) {
            System.out.print(chars[i]);
        }
    }
}
