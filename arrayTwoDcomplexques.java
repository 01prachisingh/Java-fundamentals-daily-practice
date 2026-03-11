import java.util.Scanner;

public class arrayTwoDcomplexques {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows you want in the array = ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns you want = ");
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        for(int i = 0 ;i<r;i++){
            for(int j= 0 ; j<c ;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose of the matrix = ");
        for(int i= 0 ;i<c;i++){
            for(int j = 0 ;j<r;j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
