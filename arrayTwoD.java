import java.util.Scanner;

public class TwoDarray {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner (System.in);
    //     System.out.print("Enter number of rows = ");
    //     int rows = sc.nextInt();
    //     System.out.print("Enter number of columns = ");
    //     int cols = sc.nextInt();
    //     int number [][] = new int [rows][cols];
    //     //intput
    //     for(int i = 0 ; i< rows;i++){
    //         for(int j = 0; j < cols; j++){
    //             number[i][j] = sc.nextInt();
    //         }
    //     }
    //     //output
    //     for(int i = 0;i<rows;i++){
    //         for(int j = 0; j< cols ; j++){
    //             System.out.print(number[i][j] + " ");
    //         }
    //         System.out.println();
    //     }

    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of rows = ");
        int rows = sc.nextInt();
        System.out.print("Enter number columns = ");
        int columns = sc.nextInt();
        int numbers[][] = new int [rows][columns];
        //input
        for(int i = 0; i < rows;i++){
            for(int j = 0; j< columns ; j++ ){
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        //output

        for(int i = 0 ; i<rows;i++){
            for(int j = 0; j<columns;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
