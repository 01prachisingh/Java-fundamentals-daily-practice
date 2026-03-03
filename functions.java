import java.util.*;
public class functions {
    //sum of two numbers
    // public static int calculateProduct(int a,int b){
    //          int product = a * b;
    //          return product;
    //          //or 
    //          //return a*b;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int product = calculateProduct(a,b);
    //     System.out.println("Product of two numbers = " + product);

    // }
    //factorial of a number 

    // public static int calculateFactorial(int n){
    //     if( n < 0){
    //     System.out.println("invalid");
        
    //     }
    //     int factorial = 1;
    //          for(int i = n ;i>=1 ; i--){
    //          factorial = factorial * i;  
    //     }
       
    //          return factorial;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Ebter a number = ");
    //     int n = sc.nextInt();
    //     // calculateFactorial(n);
    //     int Result = calculateFactorial(n);
    //     System.out.println("The factorial of the given number is = " + Result);
    // }     
    //sum of two numbers 
    // public static int calculateSum(int a , int b){
    //     return a + b;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     System.out.println("Sum of two numbers = " + calculateSum(a,b));
        
    // }
    //to  check if a number is prime or not
//      public static boolean isPrime(int n){
//       for(int i =2;i<n;i++){
//       if( n % i==0){
//         return false;
//      }
//     }
//     return true;
     
//   }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter a number = ");
//         int n = sc.nextInt();

//          if (isPrime(n)) {
//             System.out.println(n + " is Prime");
//         } else {
//             System.out.println(n + " is Not Prime");
//         }
//     }
    //check if number is even or not
    public static boolean isEven(int n ){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        if(isEven(n)) {
            System.out.println("The number is even ");
        }
        else{
            System.out.println("The number isn't even");
        }
        
    }
}
