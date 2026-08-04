import java.util.Arrays;

public class shallowdeepcopy {
   
    public static void main(String args[]){
    int arr[] ={10,30,20,40};
    // int x[] = arr;//shallow copy
    // x[1]=80;
    // System.out.println(arr[1]);//printing array will print x input
  
  
    int deep[] = Arrays.copyOf(arr, arr.length);//in build function
     deep[1] = 60;
     System.out.println(arr[1]);
     System.out.println(deep[1]);

}  
}
