package array;

import java.util.Scanner;

public class TwoDArrayAdding {
    public static void main(String[] args) {
        int[][] matrixA = new int[3][3];
        int[][] matrixB = new int[3][3];
        int[][] matrixC = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) { 
                matrixA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) { 
                matrixB[i][j] = sc.nextInt();
            }
        }

        System.out.println("First Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixA[i][j] + "\t"); 
            }
            System.out.println(); 
        }

        System.out.println("Second Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixB[i][j] + "\t"); 
            }
            System.out.println(); 
        }

        System.out.println("Sum of Matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println(); 
        }

     
    }
}
