import java.util.Scanner;

public class menu {
      public static int findindex( String menu[] ,String item){
      for(int i =0;i<menu.length;i++){
        if(menu[i].equalsIgnoreCase(item)){
          return i;
        }
        
      }   
      return -1; 
    }
     public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     String menu[] ={"paneer punjabi" , "samosa" ,"shahi chat" ,"biryani" };
     String item = sc.nextLine();
     int index = findindex(menu ,item);
      if(index == -1){
        System.out.println("item not found in the menu");
      }
      else{
        System.out.println("item found at number = " + (index+1));
      }
      sc.close();
    }
    }
    

