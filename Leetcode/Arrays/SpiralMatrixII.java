https://leetcode.com/problems/spiral-matrix-ii/

class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        if(n==0){
            return matrix;
        }
        int startRow = 0,startCol = 0,num = 1;
        int endRow = n-1,endCol = n-1;
        
        while(startRow <= endRow && startCol <= endCol)
        {
        for(int i=startCol;i<=endCol;i++){
            matrix[startRow][i] = num++;
        }
        startRow++;
        for(int i=startRow;i<=endRow;i++){
            matrix[i][endCol] = num++;
        }
        endCol--;
        for(int i=endCol;i>=startCol;i--){
            matrix[endRow][i] = num++;
        }
        endRow--;
        for(int i=endRow;i>=startRow;i--){
            matrix[i][startCol] = num++;
        }
        startCol++;
        }
        return matrix;
}
}
