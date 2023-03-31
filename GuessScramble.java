//Final exam ITP120 problem G GuessScramble.java by Yan lu 12/09
import java.util.Random;
import java.util.Scanner;

public class GuessScramble{
public static void main(String[] args){
String word="christmas";
Scanner input=new Scanner(System.in);
System.out.println("Below is a scrambled word.");
System.out.println(scramble(word));
System.out.println("What's the original word?");
System.out.println("Please enter your guess here");
String guess=input.nextLine().toLowerCase();
if(guess.equals(word))
System.out.println("Well done!You made the right guess.");
else
System.out.println("Wrong guess.Better luck next time.");
} 

public static String scramble(String input)
{
    Random random = new Random();
    char a[] = input.toCharArray();

    for( int i=0 ; i < a.length ; i++ )
    {
        int j = random.nextInt(a.length);
       
        char temp = a[i];
            a[i] = a[j]; 
            a[j] = temp;
    }      

    return new String( a );
}
}