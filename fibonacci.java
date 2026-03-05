import java.util.Scanner;

public class fibonacci {
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

