import java.util.Scanner;
public class calculator{
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

            System.out.println("\n==== Simple Calculator ====");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your operator: ");
            char operator = sc.next().charAt(0); 

       double result;

       System.out.print("enter you 1st number :");
       int a = sc.nextInt();
       System.out.print("enter you 2nd number :");
       int b = sc.nextInt();
      
       switch (operator) {
        case '1': 
          result = a + b;
        System.out.println("Result = " + result);
             break;
         case '2':
           result = a-b;
         System.out.println("Result" + result);
           break;
       
        case '3':
             result = a * b;
        System.out.println("Result = " + result);
            break;

        case '4':
             result = a / b;
             if (b == 0)
               System.out.println("unidentified"); 
             else
                System.out.println("Result = " + result); 
               break;
               case '5':
             System.out.println("EXIT");
            break;
       }
    }
}
