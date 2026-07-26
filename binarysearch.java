import java.util.Scanner;
public class binarysearch {
    public static int search(int number[] ,int key){
        int start = 0;
        int end = number.length-1;
       
        while (start<=end){
             int mid = (start+end) / 2;
            if(key==number[mid]){
                return mid;
            }
            else if(key<number[mid]){
                end = mid-1;
            }
            else if(key>number[mid]){
                start = mid+1;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number[] ={1,2,3,4,5,6,7,8,9};
        int key = sc.nextInt();
       System.out.println(search(number,key));
        sc.close();   

    }
    
}