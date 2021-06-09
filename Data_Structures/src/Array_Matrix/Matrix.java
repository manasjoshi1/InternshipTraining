package Array_Matrix;

import java.util.Scanner;

public class Matrix {
	static int row = 3;
	static int col = 3;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] matrix1 = new int[row][col];
		int[][] matrix2 = new int[row][col];
		input(matrix1);
		input(matrix2);
		System.out.println("Added Matrices: ");
		add(matrix1,matrix2);
	}

	public static void input(int m[][]) {
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				System.out.println("Enter matrix1 (" + r + "," + c + ") value");
				m[r][c] = sc.nextInt();
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}
	public static void add(int m1[][],int m2[][] ){
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				m1[r][c] +=m2[r][c];
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	

}
