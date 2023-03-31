// Assignment due 11/12 StringNameZip.java Yan Lu
import java.util.Scanner;

public class StringNameZip {
 static Scanner input = new Scanner(System.in);
   public static void main(String[] args) 
   {
        
      System.out.println("Please enter your first name");
      String firstName = input.next();
      firstName=checkIfDigit(firstName);
      
      if(firstName.length()>20){
      System.out.println("Only first 20 characters will be recorded");
      firstName=firstName.substring(0, 19);
      } 
  
           
      System.out.println("Please enter your last name");
      String lastName = input.next();
       lastName=checkIfDigit(lastName);
       
      /* boolean containDigit=false;
     do{ 
     containDigit=false;
     char[] charArray = lastName.toCharArray();
      for(int i = 0; i < charArray.length;i++)
      {
         if(Character.isDigit(charArray[i]))
         {System.out.println("last name contains a digit");
        containDigit=true; 
        System.out.println("Please enter your last name again.");
        lastName = input.next();
        }     
      }
      }while(containDigit==true);
      */
      
     System.out.println("Please enter your zipcode");
      String zipcode = input.next();
      zipcode=fiveDigit(zipcode);
     /* boolean isFive=true;
      if(zipcode.length()!=5){
       isFive=false;
      while(isFive=false){System.out.println("Zipcode should be 5 digits long");
      System.out.println("Please reenter zipcode.");
      zipcode = input.next();
       if(zipcode.length()==5)
         isFive=true;
      } 
      }
      */
     do{
      zipcode=checkIfChar(zipcode);
      zipcode=fiveDigit(zipcode);
      zipcode=checkIfChar(zipcode);
      }while(zipcode.length()!=5);
      
    
     
    /* do{ 
     boolean containChar=false;
     char[] charArray = zipcode.toCharArray();
      for(int i = 0; i < charArray.length;i++)
      {
         
         if(!Character.isDigit(charArray[i]))
         {System.out.println("zipcode contains a character");
        containChar=true; 
        System.out.println("Please enter 5 digit zipcode again.");
        zipcode = input.next();}     
      }
      }while(containChar==true);*/


      
             
      System.out.println("First Name: " + firstName);
       
      System.out.println("Last Name: " + lastName);
       
      System.out.println("Zipcode: " + zipcode);
          } 
          
    public static String checkIfDigit(String name){
     boolean containDigit;
     char[] charArray;
     do{ 
     containDigit=false;
     charArray = name.toCharArray();
     for(int i = 0; i < charArray.length;i++)
         {
         if(Character.isDigit(charArray[i]))
         {System.out.println("name contains a digit.");
          containDigit=true; 
          break;}
          }
          
      if(containDigit==true)
      { System.out.println("Please enter your name again.");
        name = input.next();}
             
      }while(containDigit==true);
      return name;
      }
      
      public static String fiveDigit(String zipcode){
    
      while(zipcode.length()!=5){
       System.out.println("Zipcode should be 5 digits long");
       System.out.println("Please reenter zipcode.");
       zipcode = input.next();
      } 
        return zipcode;
      }
    
      

      
   public static String checkIfChar(String zipcode) { 
   boolean containChar=false;
   char[] charArray;
   do{ 
     containChar=false;
     charArray= zipcode.toCharArray();
      for(int i = 0; i < charArray.length;i++)
      {
         
         if(!Character.isDigit(charArray[i]))
         {System.out.println("zipcode contains a character");
          containChar=true; 
          break;}
          }
            
       if(containChar==true)
        {System.out.println("Please enter 5 digit zipcode again.");
        zipcode = input.next(); }   
 
      }while(containChar==true);
      return zipcode;
      }
  
} 
