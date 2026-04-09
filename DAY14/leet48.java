package DAY14;

public class leet48 {
    public static void main(String[] args){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int r = mat.length;
        int c = mat[0].length;
        int[][] mat1 = new int[r][c];
       
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                
               mat1[i][j] = mat[r - 1 - j][i];
            }
            System.out.println("");
        }
          for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
              mat[i][j] = mat1[i][j];
            }
            
        }
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
               System.out.print(mat[i][j]);
            }
            System.out.println("");
        }
    }
}
