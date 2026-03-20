import java.util.*;
public class linearsearcharray {
    public static  int linearsearch(int numbers[], int key){
      for (int i = 0;i<=numbers.length ; i++){
        if(key==numbers[i]){
            return i;
        }
      }
      return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter the key you want to search for between 1 to 10 = ");
        int key = sc.nextInt();
        int index = linearsearch(numbers, key);
        if(index == -1){
            System.out.println("Key not found");
        }
        else{
               System.out.println("Key found at index = " +index);
        }
        sc.close();
    }
    
}
