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
public static int sumofodd(int n){
    int sum =0;
    for(int i = 1;i<=n;i++){
        if(i%2!=0){
          sum = (sum + i);
        }
     } 
      return sum/2;
} 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   //  int n = sc.nextInt();
    System.out.print("Enter n = "  );
    int n = sc.nextInt();
   
    int total = sumofodd(n);
   System.out.println("The average is = " + total); 
   sc.close();
    
}
}
