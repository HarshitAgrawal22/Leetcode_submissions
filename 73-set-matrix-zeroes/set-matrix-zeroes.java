class Solution {
    public void setZeroes(int[][] matrix) {
        int[] r=new int[matrix.length* matrix[0].length];
        for(int i=0;i<r.length;i++){
            r[i]=-1;
        }
        int[] c= new int[matrix.length*matrix[0].length];
        for(int i=0;i<c.length;i++){
            c[i]=-1;
        }
        int r_pos=0;
        int c_pos=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    r[r_pos]=i;
                    r_pos++;
                    c[c_pos]=j;
                    c_pos++;
                    System.out.println(""+i+" "+j);
                }
            }
        }

        for(int i=0;i<r.length;i++){
            if(r[i]!=-1){
                System.out.println(r[i]);
                for(int j=0;j<matrix[0].length;j++){
                    matrix[r[i]][j]=0;
                }
                
            }
            
        }
        for(int i=0;i<c.length;i++){
            if(c[i]!=-1){
                for(int j=0;j<matrix.length;j++){
                    matrix[j][c[i]]=0;
                }
                
            }
            
        }
    }
}