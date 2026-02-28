public class pattern12types {
    public static void main(String[] args) {

    // inverted halfpyramid with numbers
      //int n = 5;
    // for( int i=n;i>=1;i--){
    //         for(int j=1;j<=i;j++){
    //            System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    //  solid rectangle 
    // int n = 4;
    // int m = 5;
    //  for (int i=0; i<n;i++){
    //     for(int j=0;j<m;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //  }
    // hollow rectangle 
    // int n = 4;
    // int  m = 5;
    // for (int i = 1;i<=n;i++){
    //     for (int j= 1;j<=m;j++){
    //          if (i == 1 || j == 1 || i == n||j == m) {
    //             System.out.print("*");
    //          } else{
    //             System.out.print(" ");
    //          }
    //     }
    //      System.out.println();
    //      }
    //half pyramid
    // int n = 4;
    // for(int i =1; i<=n;i++){
    //     for(int j=1 ; j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println(" ");
    // }
    //inverted half pyramid
    // int n=4;
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    //inverteh180 dergree half pyramid
//    int n= 4;
//    for(int i=0;i<=n;i++){
//     for(int k=0;k<=(n-i);k++){
//         System.out.print(" ");
//     }
//     for(int j=0;j<=i;j++){
//         System.out.print("*");
//     }
   
//     System.out.println();
//    }
//half pyramid with numbers
//   int n = 5;
// for (int i =1;i<=5;i++ ){
//     for(int j = 1; j<=i ; j++){
//         System.out.print(j);         
//     }
//     System.out.println();
// }
//inverted half pyramid with numbers
// int n= 5;
// for(int i = n; i>=1;i--){
//     for(int j = 1 ;j<=i;j++ ){
//         System.out.print(j);
//     }
//     System.out.println();
// }
//floyds traingle
// int number = 1;
// int n = 5;
// for (int i=1;i<=5;i++){
//     for(int j = 1;j<=i;j++){
//         System.out.print(number);
//            number = number + 1;
//         }
//         System.out.println();
// }
     //0-1traingle
    //   int n = 5;
     
    //   for (int i= 1; i <=n;i++){
    //     for (int j=1;j<=i;j++){
    //         int num = i+j;
    //         if(num % 2== 0){
    //            System.out.print("1");
    //         }
    //         else{
    //             System.out.print("0");
    //         }
    //     }
    //     System.out.println();
    //   }
    //solid rhombus
    // int n = 5;
    // for ( int i = 1;i<=n;i++){
    //       for(int k=1;k<=(n-i);k++){
    //             System.out.print(" ");
    //         }
    //     for ( int j = 1;j<=n;j++){
    //         System.out.print("*");
            
    //     }
    //     System.out.println();
    // }
    //number pyramid
    // int n= 5;
    // for (int i= 1;i<=n;i++){
    //     for (int j = 1;j<=(n-i);j++){
    //         System.out.print(" ");
    //     }
    //     for ( int k =1;k<=i;k++){
    //         System.out.print(i+" ");
    //     }
    //     System.out.println();
    // }
     int n = 5;
       for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }


           //first part
           for(int j=i; j>=1; j--) {
               System.out.print(j);
           }


           //second part
           for(int j=2; j<=i; j++) {
               System.out.print(j);
           }
           System.out.println();
       }

    }
    
}
