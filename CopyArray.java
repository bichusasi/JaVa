package array;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
    	int r;
    	int c;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the row sze :");
    	r = sc.nextInt();
    	System.out.println("Enter the coulmn sze :");
    	c = sc.nextInt();
        int [][] matrix = new int[r][c];
        int [][] matrixA = new int [r][c];
        

        System.out.println("Ente metrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) { 
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + "\t"); 
            }
            System.out.println(); 
        }
        
        System.out.println("Copy of metrix :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrixA[i][j] = matrix[i][j];
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println(); 
        }

}
}
