import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] emptyMatrix = new int[size][size];
        int[][] spiralMatrix = createSpiral(emptyMatrix, size);
        printSpiralMatrix(spiralMatrix);
    }
    public static int[][] createSpiral(int[][] matrix, int size){
        int minRow = 0;
        int maxRow = size - 1;
        int minCol = 0;
        int maxCol = size - 1;
        int currentNum = 1;

        while (currentNum <= size * size){
            for (int i = minCol; i <= maxCol; i++) {
                matrix[minRow][i] = currentNum++;
            }
            for (int i = minRow + 1; i <=maxRow ; i++) {
                matrix[i][maxCol] = currentNum++;
            }
            for (int i = maxCol - 1; i >= minCol; i--) {
                matrix[maxRow][i] = currentNum++;
            }
            for (int i = maxRow - 1; i >= minRow + 1; i--) {
                matrix[i][minCol] = currentNum++;
            }
            minRow++;
            maxRow--;
            minCol++;
            maxCol--;
        }
        return matrix;
    }
    public static void printSpiralMatrix(int[][] spiralMatrix){
        for (int i = 0; i < spiralMatrix.length; i++) {
            for (int j = 0; j < spiralMatrix.length; j++) {
                System.out.print(spiralMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}