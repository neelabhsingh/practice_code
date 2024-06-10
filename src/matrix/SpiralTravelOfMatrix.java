package matrix;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SpiralTravelOfMatrix {
    public static void main(String[] args) {
        int [] [] matrix = {{1,2,3, 4,5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        List<Integer> path = printSpiral(matrix);
        String spiral = path.stream().map(number -> number.toString()).collect(Collectors.joining(","));
        System.out.println(spiral);
    }

    public static List<Integer> printSpiral(int [][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int colIndex = 0, rowIndex =0;
        List<Integer> spiralPath = new ArrayList<>();
        while (rowIndex< row && colIndex < col){
            for(int i=colIndex; i<col; i++){
                spiralPath.add(matrix[rowIndex][i]);
            }
            rowIndex++;

            for(int i=rowIndex; i<row; i++){
                spiralPath.add(matrix[i][col -1]);
            }
            col--;

            if(rowIndex < row){
                for(int i=col-1; i>=colIndex; i--){
                    spiralPath.add(matrix[row - 1][i]);
                }
            }
            row--;
            if(colIndex < col){
                for(int i=row -1; i>= rowIndex; i--){
                    spiralPath.add(matrix[i][colIndex]);
                }
            }
            colIndex++;
        }
        return spiralPath;
    }
}
