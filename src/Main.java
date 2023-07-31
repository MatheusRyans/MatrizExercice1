import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the Matriz Dimension M: ");
        int M = sc.nextInt();
        System.out.print("What is the Matriz Dimension N: ");
        int N = sc.nextInt();
        System.out.println("Matriz: ");
        int[][] mat = new int [M][N];

        for( int i=0; i< M; i++){
            for( int j=0; j< N; j++){

                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("What is the number reference: ");
        int num = sc.nextInt();
        for( int i=0; i< M; i++){
            for( int j=0; j< N; j++){
                if (mat[i][j] == num) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }




        sc.close();
    }
}