public class sumofsubarray {
  
    public static void subarray(int number[]){
        int largest =Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length ;j++){
                int end = j;
                int sum = 0;
                for(int k=start ; k<=end;k++){
                    System.out.print(number[k] + " "); 
                     sum = sum + number[k];
                     //largest sum of subarray
                     if(largest<sum){
                        largest = sum;}
                        //smallest sum of subarray
                        else if(smallest>sum){
                         smallest = sum; }
                } 

                 System.out.print("sum" +sum);
                 
                 System.out.println();
                 }
              System.out.println();
             
        }
         System.out.println("largest subarray =" + largest);
         System.out.println("smallest in subarray = " + smallest);
    }
    public static void main (String args[]){
        int number[] ={ 1,-2,-1,4,-3,6};
        subarray(number);
       
    }
    
}

