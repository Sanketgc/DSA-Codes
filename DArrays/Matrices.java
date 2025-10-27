import java.util.Scanner;

public class Matrices {

    public static void maximumval(int matrix[][]){

        int max= Integer.MIN_VALUE;
         for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                }
                
            }
        }
        System.out.println(max);

    }

    public static boolean search(int matrix[][], int key){

         for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key){
                    System.out.println("The key is at the index (" +i +"," +j + ")");
                    return  true;
                }
            }
            
        }
        System.out.println("The key doesn't exists");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        search(matrix, 8);
        maximumval(matrix);
    }

}