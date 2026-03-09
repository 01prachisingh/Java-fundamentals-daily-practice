import java.util.*;
public class arrays {
    //initialization without declaration will give null value

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the space you want = ");
    //     int size = sc.nextInt();
    //     int number[] = new int[size];
    //      for(int i = 0; i<size ; i++){
    //         System.out.println(number[i]);
    //      }
    //       sc.close();
    //     }
    // with declaration
    // public static void main (String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size you want to take = " );
    //     int size = sc.nextInt();
    //     int numbers[] = new int[size];
    //     //input
    //     for(int i = 0 ; i<size ; i++){
    //         numbers[i] = sc.nextInt();
    //     }
    //     //output
    //     for(int i = 0;i<size;i++ ){
    //         System.out.println(numbers[i]);
    //     }
    //     sc.close();
    // }
    //to find a nmber in the array and print its index number
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner (System.in);
    //     System.out.print("Enter the size  = ");
    //     int size = sc.nextInt();
        
    //     int number[] = new int[size];
    //     for(int i = 0 ; i < size;i++){
    //         number[i] = sc.nextInt();
    //     }
    //      System.out.print("enter the number to be searched = ");
    //         int x = sc.nextInt();

    //     for(int i = 1; i< size;i++ ){
    //         if(number[i]==x){
    //             System.out.println("Number found at index = " +i);
    //             break;
    //         }
    //     }
    //    sc.close();
    //  }
    //using the numbers.length function
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        for(int i= 0 ;i<size;i++){
            number[i] = sc.nextInt();
          }
          System.out.print("Enter the number you want to search from = ");
          int x = sc.nextInt();
          for (int i = 0 ; i<number.length ; i++){
            if(number[i] == x){
            System.out.println("Number found at index = " + i );
          }
        }
          sc.close();
      }
      
    }
    
   
