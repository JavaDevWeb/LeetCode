package Easy._566_ReshapeTheMatrix;

/*
*   - Trong matlab, co mot ham tien dung dc goi la dinh hinh lai, co the dinh hinh lai ma tran m x n thanh
*   mot ma tran moi co kich thuoc r x c khac ma van giu nguyen du lieu goc
*   - Ban dc cho mot ma tran m x n va hai so nguyen r va c bieu thi so hang va so cot cua ma tran dc dinh
*   hinh lai mong muon
*   - Ma tran dc dinh hinh lai phai dc lap day voi tat ca cac phan tu cua ma tran ban dau theo cung thu tu
*   duyet hang nhu cu
*   - Neu thao tac dinh hinh lai voi cac tham so da cho la co the hop phap, hay xuat ra ma tran dc dinh
*   hinh lai moi, nguoc lai, xuat ra ma tran goc.
*   VD1: mat = [[1,2],[3,4]], r = 1, c = 4 => [[1,2,3,4]]
*   VD2: mat = [[1,2],[3,4]], r = 2, c = 4 => [[1,2],[3,4]]
*   - Rang buoc:
*       + m == mat.length
*       + n == mat[i].length
*       + 1 <= m, n <= 100
*       + -1000 <= mat[i][j] <= 1000
*       + 1 <= r, c <= 300
*/

import java.util.Arrays;

public class Solution {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int colums = mat[0].length;
        if((rows * colums) != (r * c)) return mat;

        int[][] output_arr = new int[r][c];
        int row_num = 0;
        int colum_num = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                output_arr[row_num][colum_num] = mat[i][j];
                colum_num++;
                if(colum_num == c) {
                    colum_num = 0;
                    row_num++;
                }
            }
        }
        return output_arr;
    }
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3,4}};
        int r = 2, c = 4;
        int[][] result = matrixReshape(mat, r, c);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
