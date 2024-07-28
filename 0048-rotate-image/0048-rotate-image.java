class Solution {
    public void rotate(int[][] matrix) {
        int[][] newMatrix=new int[matrix.length][matrix.length];
        int m=matrix.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                newMatrix[j][m-1-i]=matrix[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=newMatrix[i][j];
            }
        }
    }
}