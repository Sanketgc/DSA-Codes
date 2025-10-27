public class SpiralMatrices {

    public static void Spiralmatrix(int Matrix[][]){

         int rowstart =0;
        int colstart =0;
        int rowend = Matrix.length-1;
        int colend = Matrix[0].length-1;

        while(rowend > rowstart && colend>colstart){

             //TOP
             for(int j=colstart; j<=colend; j++){
                System.out.print(Matrix[rowstart][j]+" ");
             }

             //Right
             for(int i=rowstart+1; i<=rowend; i++){
                System.out.print(Matrix[i][colend]+" " );
             }

             //BOTTOM
             for(int j=colend-1; j>=colstart; j--){
                if(rowstart == rowend){
                    break;
                }
                System.out.print(Matrix[rowend][j]+" ");
             }

             //LEFT
             for(int i=rowend-1; i>=rowstart+1; i--){
                if(colstart == colend){
                    break;
                }
                System.out.print(Matrix[i][colstart]+" ");
             }
             
             rowstart++;
                colstart++;
                rowend--;
                colend--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
       
        int Matrix[][] ={{1,2,3},
                            {5,6,7},
                            {9,10,11},
                            };

        Spiralmatrix(Matrix);

    }
}
