public class spiralarray {
    public static void circlemethod(int matrix[][]) {
        //while and boundary ka top then right then bottom then left
        int startrow=0;
        int startcolumn=0;
        int end_row=matrix.length-1;
        int end_column= matrix.length-1;
        while (startrow<=end_row && startcolumn<= end_column) {
            //top
            for (int j=startcolumn;j<=end_column;j++){
                System.out.println(matrix[startrow][j] +" ");
            }
            //right
            for (int i=startrow+1;i<=end_row;i++){
                System.out.println(matrix[i][end_column] +" ");
            }
            //bottom
            for (int j=end_column-1;j<=startcolumn;j--){
                // for odd possibilitites
                if (startrow==end_row){
                    return;
                }
                System.out.println(matrix[end_row][j] +" ");
            }
            //left
            for (int i=end_row+1;i<=startrow-1;i--){
                if (startcolumn==end_column){
                    return;
                }
                System.out.println(matrix[i][startcolumn] +" ");
            }
            startrow++;
            startrow++;
            end_column--;
            end_row--;
        }

    }
    public static void main(String[] args) {
        int matrix[][]= {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
        circlemethod(matrix);
                        
    }
}
