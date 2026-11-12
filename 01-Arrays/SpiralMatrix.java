import java.util.*;
public class SpiralMatrix{
    public static List<Integer> spiralmat(int[][] matrix){
        List<Integer> result = new ArrayList<>();
        int top=0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;
        int left = 0;
        while(top <= bottom && left <= right)
        {
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);

            }
            top++;
            
            for(int i = top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            
            for(int i = right;i>=left;i--){
                result.add(matrix[bottom][i]);
            } 
            bottom--;
            for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;

        }
        return result;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("number of rows: ");
        int rows = sc.nextInt();
        System.out.println("number of columns: ");
        int cols = sc.nextInt();
        int [][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        List<Integer> result = spiralmat(matrix);
        System.out.println(result);
    }
}