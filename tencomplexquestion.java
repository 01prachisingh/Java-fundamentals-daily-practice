import java.util.*;
public class tencomplexquestion{
    //average of 3 numbers
// public static int average(int a , int b , int c){
//     int result = a*b*c/2;
//     return result;

// }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int answer = average(a,b,c);
//         System.out.println("the average is = " + answer); 
//         sc.close();      
//     }
//sum of all odd between 1 to n
// public static int sumofodd(int n){
//     int sum =0;
//     for(int i = 1;i<=n;i++){
//         if(i%2!=0){
//           sum = (sum + i);
//         }
//      } 
//       return sum/2;
// } 
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.print("Enter n = "  );
//     int n = sc.nextInt();
   
//     int total = sumofodd(n);
//    System.out.println("The average is = " + total); 
//    sc.close();
    
// }
//greater out of 2 numbers
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
          
    //      System.out.print("Enter your 1st choice = ");
    //         int a = sc.nextInt();
    //         System.out.print("Enter your second choice = ");
    //         int b = sc.nextInt();
    //         if(a>b){
    //             System.out.println("The greater number is  = " + a);
    //         }
    //         else{
    //             System.out.println("The greater number is = " + b);
    //         }
    //     sc.close();
    // }
    //finding the Circumference

    // public static double circleCircum(double r){
    // double circum = ( 2 * Math.PI * r );
    // return circum ;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner (System.in);
    //     System.out.print("Enter the radius of the circle = ");
    //     double r = sc.nextDouble();
        
    //     double result = circleCircum(r);
    //    System.out.print("The circumference of the circle is = " + result);
    //     sc.close();
        
    // }
    //question 5  
    //eligible for vote or not
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the age = ");
    //     int age = sc.nextInt();
    //     if(age > 18){
    //         System.out.println("elgible for vote");
    //     }
    //     else{
    //         System.out.println("not eligible for voting ");
    //     }
    // }
      //question 6 infinite loop using do while condition
    //  public static void main(String[] args) {
    //     do{
    //         System.out.println("hello world");
    //     }
    //     while(true);
        
    //        }
    // question 8 enter two number and find the value of one number raised to the power of another 
        //  public static double classPower(double x , double n){
        //     double value = Math.pow(x, n);
        //     return value;
        //  }
        //  public static void main(String[] args) {
        //     Scanner sc = new Scanner (System.in);
        //     System.out.print("Enter the base number = ");
        //     int x = sc.nextInt();
        //     System.out.print("Enter the exponent = ");
        //     int n = sc.nextInt();
        //     double result = classPower(x, n);
        //     System.out.println("The Result is = " + result);
        //     sc.close();

        //  }
        //question 9 greatest common divisor of 2 numbers
        // fibonacci series 
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.print("Enter the number n = ");
            int n = sc.nextInt();
            int a = 0;
            int b = 1;
            for(int i = 1;i<=n;i++){
                int next = a + b;
                a = b;
                b = next;
                System.out.print( a + " ");
            }
            sc.close();
        }
    }
    



