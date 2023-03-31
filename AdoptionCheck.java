//Final exam ITP120 problem C AdoptionCheck.java by Yan lu 12/09
import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Arrays;


public class AdoptionCheck{
public static void main(String[] args){

Scanner input=new Scanner(System.in);
int[] ArrayNum={3,4,1,0,0};
String[] ArrayPet={"dogs", "cats", "rabbits","snakes","squirrels"};
System.out.println("What kind of animal are you interested in? Please enter below:");
String userWant=input.nextLine().toLowerCase();

while(userWant!="end"){
boolean found=false;
for(int i=0;i<ArrayPet.length;i++){
if((userWant.equals(ArrayPet[i]))||((userWant.concat("s")).equals(ArrayPet[i])))
{System.out.println("There are "+ArrayNum[i]+" "+userWant+" available.");
found=true;}
}
if(found==false){System.out.println("Sorry, we do not keep "+userWant+".");
}
System.out.println("Please enter another animal you are interested blow.Or enter end to exit.");
 userWant=input.nextLine().toLowerCase();
 if(userWant.equals("end"))
break;
}

 System.out.println("Thank you for your interest!");

}


}