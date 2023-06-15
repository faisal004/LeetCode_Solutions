class Solution {
    public void rotate(int[][] matrix) {
        int length=matrix.length;
        transpose(matrix,length);
        reflection(matrix,length);
    }
    private void transpose(int[][] matrix,int length){
        for(int  i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    private void reflection(int[][] matrix,int length){
        for(int  i=0;i<length;i++){
            for(int j=0;j<length/2;j++){
                int temp= matrix[i][j];
                matrix[i][j]=matrix[i][length-1-j];
                matrix[i][length-1-j]=temp;
            }
        }
    }
}