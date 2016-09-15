/**
 * Created by Jakob on 14-09-2016.
 */

import java.util.*;

public class ITJPch12exercise3 {

   public static void main(String[] args) {
   
      int[] array = new int[100];
      for (int i = 0; i < array.length; i++) {
         array[i] = (int) (Math.random() * 100);
      }
      Scanner input = new Scanner(System.in);
      System.out.print("Choose index (0-99): ");
   
      try {
         int index = input.nextInt();
         System.out.println("Array[" + index + "] = " + array[index]);
      
      } 
      catch (IndexOutOfBoundsException ex) {
         System.out.println("Index " + ex.getLocalizedMessage() + " is out of bounds");
      
      } 
      catch (InputMismatchException ex) {
         System.out.println("You can't do that man!");
      }
   }

}
