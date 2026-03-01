public class advancedpatterntypes {
    public static void main(String[] args) {
        //hollow butterfly
        int n=5;
        for(int i =1;i<=n;i++){
            for(int j = 1; j<=i;j++){
            if(j == 1 || i == j){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        for(int j = 1; j<=(2*(n-i));j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            if( i == j || j==1  ){
                System.out.print("*");
            }
                else{
                    System.out.print(" ");
                }
            
        }
        System.out.println();
           
        }


            for(int i =n;i>=1;i--){
            for(int j = 1; j<=i;j++){
            if(j == 1 || i == j){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        for(int j = 1; j<=(2*(n-i));j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            if( i == j || j==1  ){
                System.out.print("*");
            }
                else{
                    System.out.print(" ");
                }
            
        }
        System.out.println();
           
        }

        //solid rhombus
        // int n =5;
        // for(int i=1;i<=n;i++){
        //     for(int j =1;j<=(n-i);j++){
        //     System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     for(int j =1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
        //palindromic pattern
    //     int n =5;
    //     for(int i = 1;i<=n;i++){
    //        for(int j = 1;j<=(n-i);j++){
    //            System.out.print(" ");
    //        }    
    //            for(int k = i;k>=1;k--){
    //         System.out.print(k);
    //          }
    //          for(int j=2;j<=i;j++){
    //             System.out.print(j);
    //          }
    //         System.out.println();
    //   }
       //diamond pattern
    //         int n = 4;
    // for(int i = 1;i<=n;i++){

    //     for(int j=n;j>=i;j--){
    //         System.out.print(" ");
    //     }
    //   int m = (i+(i-1));
    //     for(int j = 1 ;j <= m;j++){
    //            System.out.print("*");
    //     }
        
    //     System.out.println();
    //  }      
    
    // for(int i = n;i>=1;i--){

    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //   int o = (i+(i-1));
    //     for(int j = 1 ;j <= o;j++){
    //            System.out.print("*");
    //     }
        
    //     System.out.println();
    //  }  
      // inverted half pyramid
    //   int n=4;
    //   for(int i = 1; i<=n;i++){
    //     for(int j=n;j>=i;j--){
    //         System.out.print(i);
    //        }
    //     System.out.println();
    //   }
          //half pyramid
            //   int n = 5;
            //   for(int i = 1 ;i<=n;i++){
            //     for(int k= 1;k<=(n-i);k++){
            //         System.out.print(" ");
            //     }
                
            //     for(int j=1;j<=i;j++){
            //          System.out.print(j+" ");
            //   }  
            //   System.out.println();
            // }
            //hollow rhombus
            // int n = 5;
            // for(int i =1;i<=n;i++){
            //     for(int j=1;j<=(n-i);j++){
            //         System.out.print(" ");
            //     }
            //     for(int j = 1;j<=n;j++){
            //         if( i== 1 || j==1 || i==5 || j==5 ){
            //             System.out.print("*");
            //         }
            //         else {
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();
            // }

    }
}
