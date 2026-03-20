//import java.util.*;
public class largestsmallestinarray {
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<numbers.length;i++){
            System.out.println(numbers[i]);
            if(largest<numbers[i]){
             largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number = " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {15,5,27,3,22,6,87,66,9};
        System.out.println("Largest number =" + getlargest(numbers));
        
    }
    
}
