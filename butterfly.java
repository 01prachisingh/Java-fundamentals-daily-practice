public class butterfly {
    public static void main(String[] args) {
           int n = 4;
           for(int i =1; i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
             int m = (2*(n-i));
                for(int k=1;k <= m;k++){
                    System.out.print(" ");
                    }
               for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();
           } 
             for(int i =4; i>=1;i--){
                int m = (2*(n-i)); 
               for(int j=i;j>=1;j--){
                System.out.print("*");
               }
               for(int k =m;k>=1;k--){
                System.out.print(" ");
               }
               for(int j=i;j>=1;j--){
                System.out.print("*");
               }
               System.out.println();
            }
           
    }
    
}
