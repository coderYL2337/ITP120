//ITP 120 Assignment Nov 9th problem one, by Yan Lu

import java.io.*;
import java.util.*;
public class StringUpLowerSpecial {
    public static void main(String args[] ) throws Exception {
         int count=0,count2=0,i;
         Scanner input = new Scanner(System.in);
         System.out.println("Please enter a string ");
         String str = input.nextLine();
        
         for( i=0; i<str.length(); i++)
         {
             if(Character.isUpperCase(str.charAt(i)))
                {count++;}
             if(Character.isLowerCase(str.charAt(i)))
                 {count2++;}
         }
                                  
         int countReg = 0;  
         for (int j = 0; j < str.length(); j++) 
          {
            char c = str.charAt(j);
            if (!(Character.isDigit(c) || Character.isLetter(c)))
              {
               countReg++;
                }
          }
        
        System.out.println("Count of upper case letters: " + count);
        System.out.println("Count of lower case letters: " + count);
        System.out.println("Count of special characters: " + countReg);
       
   }
}