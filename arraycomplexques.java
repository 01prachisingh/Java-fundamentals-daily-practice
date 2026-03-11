import java.util.Scanner;

public class arraycomplexques {
    // to find the maximum and minimum number in an array of integer
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size ofthe array you want = ");
        int size = sc.nextInt();
        int integers[] = new int[size];
        for(int i = 0;i<size;i++){
            integers[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<integers.length;i++){
            if(integers[i] > max){
                max = integers[i];
            }
            if(integers[i] < min){
                min = integers[i];
            }
        }
            System.out.println("Largest nuumber in the given array is = " + max);
            System.out.println("Smallest number in the given array = " +min);

        
        sc.close();

    }
    //array of names as input from user and print them on the screen

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();
    //     String names[] = new String[size];
    //     //input
    //      for(int i = 0 ;i<size;i++){
    //         names[i] = sc.next();
    //      }
    //      //output
    //         for(int j = 0; j<names.length;j++){
    //             System.out.println((j+1) + ". NAME = " + names[j]);
    //          }
    //          sc.close();
    // }
    
}
